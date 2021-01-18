void call( def description ) {
  stage('init') {
    currentBuild.description = description
    println 'running init'
  }
}
