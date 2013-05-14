DyVis
=====
The Dynamic Visualizer (short DyVis) is able to visualize the static structure and the dynamic behavior of an arbitrary software system by means of information based on static and dynamic analysis. DyVis offers a flexible architecture to easily add support for arbitrary input formats. For now, it accepts KDM representations of software systems representing the statics, and Kieker-based execution traces representing the dynamics.

License
---
Eclipse Public License - v 1.0 (http://www.eclipse.org/legal/epl-v10.html)

Requirements
---
- JRE 6 or 7
- Java 3D native library 'j3dcore-ogl' (Included for Windows x64)

Compilation
---
If you get an access restriction for a particular library in Eclipse, do the following with it:

1. add the library
2. put the library at the top of the "Order and Export" tab in the project's build path

This inconvenience will be fixed in the near future.

Execution
---
You need to add the native library 'j3dcore-ogl' to the PATH variable. For Windows x64, DyVis already contains the required DLL at
~~~
lib/java3d/j3dcore-ogl.dll
~~~

To temporarily add the PATH variable for the time of execution only, you can set it in Eclipse's 'Run Configurations' in the 'Environment' tab with the following path:
~~~
${project_loc}/lib/java3d
~~~
