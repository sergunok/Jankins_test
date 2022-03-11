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
                        checkout([
                            $class: 'GitSCM',
                            branches: [[name: 'master']],
                            userRemoteConfigs: [[
                                url: 'https://github.com/rmccue/test-repository.git'
                            ]]
                        ])
                        
                        println sh(script: 'pwd', returnStdout: true)
                        println sh(script: 'ls -la', returnStdout: true)
                    }
                }
            }
        }
    }
}
