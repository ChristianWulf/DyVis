DyVis
=====
The Dynamic Visualizer (short DyVis) is able to visualize the statics and the dynamics of an arbitrary software system by means of information based on static and dynamic analysis. DyVis offers a flexible architecture to easily add support for arbitrary input formats. For now, it accepts KDM representations of software systems representing the statics, and Kieker-based execution traces representing the dynamics.

License
---
Eclipse Public License - v 1.0 (http://www.eclipse.org/legal/epl-v10.html)

Requirements
---
- JRE 6 (DyVis uses some Java packages that were removed in JRE 7. I will fix this soon.)

Compilation
---
If you get an access restriction for a particular library, do the following with it:
1.) add the library
2.) put the library at the top of the "Order and Export" tab in the project's build path
