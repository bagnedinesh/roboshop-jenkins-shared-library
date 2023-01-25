def call(){
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('Hello another stages') {
                steps {
                    echo 'Hello from another stages'
                }
            }
        }

    }
}




