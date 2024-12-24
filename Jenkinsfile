pipeline {
    agent any

    tools {
        gradle 'Gradle_8.12'  // Ajusta al nombre de tu instalación de Gradle en Jenkins
        jdk 'Java_22'         // Ajusta al nombre de tu instalación de Java en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Clonando el repositorio desde GitHub...'
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/jphm95/SeleniumPractice.git']]
                ])
            }
        }
        stage('Build') {
            steps {
                echo 'Construyendo el proyecto con Gradle...'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Ejecutando pruebas con Gradle y Cucumber...'
                sh './gradlew test -Dcucumber.filter.tags="@Navigation"' // Cambia los tags si es necesario
            }
        }
        stage('Report') {
            steps {
                echo 'Generando reportes de pruebas...'
                sh 'ls build/reports/tests/test/index.html'
            }
        }
    }

    post {
        always {
            echo 'Limpiando recursos al finalizar...'
            sh './gradlew clean'
        }
        success {
            echo 'Pipeline ejecutado con éxito.'
        }
        failure {
            echo 'La ejecución del Pipeline falló. Revisa los logs para más detalles.'
        }
    }
}
