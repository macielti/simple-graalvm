# Simple GraalVM

A Leiningen template inspired by [Clojure GraalVM project](https://github.com/clj-easy/graalvm-clojure).

The idea is to provide a simple boilerplate project to validate if a lib is compatible with GraalVM native image
generation process.

## Usage

1. Create a new project based on the template:

``` bash 
lein new net.clojars.macielti/simple-graalvm myproject
```

2. Populate the project with a hello word example for the lib you want to experiment with.

3. Generate the native image:

``` bash 
lein do clean, uberjar, native
```

4. Execute the output native image:

``` bash 
lein run-native
```

## License

Copyright © 2025 Bruno do Nascimento Maciel

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
