templateRepository(url: "https://github.com/dmitriybondr/bamboo.git/plantemplates/")


plan(key:'BaseAMI',name:'BaseAMI') {
  trigger(type:'polling',strategy:'periodically',frequency:'180') {
    repository(name:'hipchat-ami')
  }

  stage(name:'ami') {
    job(key:'JOB1',name:'Run packer and create base AMI') {
      
     }

  }

}
