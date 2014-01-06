# Setup
From the [*Eclipse* download page](http://www.eclipse.org/downloads/) download and install: 
 * `Eclipse Modeling Tools`

Start the *Eclipse Modeling Tools*.

From the [*XText* update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/) install:
 * `Xtext-2.4.3`

From the [*Itemis* update site](http://download.itemis.de/updates/) install:
 * `Xtext Antlr-2.0.0`

JOHANNESPLUGINS

# Import
Go to `File > Import... > General > Existing Projects into Workspace` and import the `sle.fsml` and `sle.fsml.*` projects. Wait for *Eclipse* to index and build all the projects.  

Run a new *Eclipse Application* by clicking on the `sle.fsml` project root and selecting `Run > Run`. The new *Eclipse* now contains all the plugins required to edit and view the *FSML* files.  


# Edit
In the new *Eclipse Application*, create a new *Plug-in Project*. Go to the *MANIFEST.MF* and add `sle.fsml` plugin as a *Required Plug-in* or `sle.fsml.runtime` as an *Imported Package* under the *Dependencies* tab.  

Create or add any file with a *.fsml* or *.input* extension and open it. If *Eclipse* asks you if it should add the *XText Nature* click yes.  
A `src-gen` folder will be created as soon as any *.fsml* file is valid. To use the generated *Java* classes, add `src-gen` to the build path by right-clicking and selecting `Build Path > Use as Source Folder`.  

To run a *FSM*, go to `Run > Run Configurations...` and create a new *FSML Simulation* and fill out the *Simulation* tab.  

If you run the configuration with `Write to console` activated, running the *Run Configruation* will open a new console window in *Eclipse* displaying the output of the simulation or pop up a message box displaying run errors like the invalid or infeasible input exceptions. If you select `Write to file`, the output will be written to the file specified in the ouput form field.  
