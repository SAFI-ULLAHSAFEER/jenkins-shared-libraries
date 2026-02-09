  def call(){
  sh "docker-compose down && docker-compose up -d"
    echo "Application deploy successfully"
}
