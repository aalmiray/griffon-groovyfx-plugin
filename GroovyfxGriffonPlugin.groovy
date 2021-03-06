/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Dean Iverson
 */
class GroovyfxGriffonPlugin {
    String version = '0.3'
    String griffonVersion = '0.9.5-SNAPSHOT > *' 
    def dependsOn = [:]
    List pluginIncludes = []
    String license = 'Apache Software License 2.0'
    List toolkits = ['swing', 'javafx']
    List platforms = []
    String source = 'https://github.com/deanriverson/griffon-groovyfx-plugin'
    String documentation = ''
    List authors = [
        [
            name: 'Dean Iverson',
            email: 'deanriverson@gmail.com'
        ]
    ]
    String title = 'Griffon JavaFX Plugin'
    String description = '''
A plugin that provides use of the GroovyFX library from within a Griffon application.
'''
}
