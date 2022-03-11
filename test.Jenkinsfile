pipeline {
    agent any
    tools {
        nodejs 'N17'
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                script {
                    dir('test_dir') {
                        println sh(script: 'pwd', returnStdout: true)
                    }
                }
            }
        }
    }
}
