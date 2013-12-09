/*
 * generated by Xtext
 */
package eu.pasusu.megal.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import eu.pasusu.megal.megaL.EntityDeclaration

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class MegaLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('declarations.txt', '''
		«FOR i: resource.allContents.filter(typeof(EntityDeclaration)).toIterable»
		Model declares entity "«i.name»"
		«ENDFOR»
		''');
			
	}
}