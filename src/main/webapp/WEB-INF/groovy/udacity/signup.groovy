request.setAttribute 'contentTitle', 'Unit 2 Signup'
request.setAttribute 'contentBodyId', 'www-deniswindsor-co-uk-udacity-hm2-signup'

request.setAttribute 'formText', new Rot13().encrypt(params['text'])

forward '/WEB-INF/templates/udacity/signup.html'