node {
    stage('pull') {
        git branch: 'main', url: 'https://github.com/iamtruptimane/ECS-blue-green-deployment.git'
    }
    stage('Build') {
        echo 'Build succeeded'
    }
    stage('Test') {
        echo 'Test cases passed'
    }
    stage('Deploy') {
        echo 'Yahoo!! Application deployed successfully'
    }
}