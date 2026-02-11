// docker_build.groovy
def call(String dir, String tag, String user) {
    echo "Building Docker image for ${dir}..."
    sh "docker build -t ${user}/${dir}:${tag} ./${dir}"
    echo "Docker image ${user}/${dir}:${tag} built successfully ✅"
}
