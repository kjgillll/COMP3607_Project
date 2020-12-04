module.exports = function (grunt) {

  var config = {

    coffee: {
      compile: {
        files: {
          'example.js':                  ['src/example.coffee'],
          'lib/counter_hash.js':         ['src/counter_hash.coffee'],
          'test/counter_hash_test.js':   ['src/test/counter_hash_test.coffee']
        }
      }
    },

    mocha_istanbul: {
      coverage: {
        src: 'test', // the folder, not the files
        options: {
          coverageFolder: 'coverage',
          mask: '**/*_test.js',
          root: '/',
          mochaOptions: { slow: 200 }
        }
      }
    }

  };

  grunt.initConfig(config);
  grunt.loadNpmTasks('grunt-contrib-coffee');
  grunt.loadNpmTasks('grunt-mocha-istanbul');
  grunt.registerTask('test', [ 'mocha_istanbul:coverage' ]);
  grunt.registerTask('default', [ 'coffee' ]);
};
