module.exports = {
    "env": {
        "browser": true,
        "commonjs": true,
        "es2021": true
    },
    "overrides": [
      {
        "files": [
          "**/*.spec.js",
          "**/*.test.js"
        ],
        "env": {
          "jest": true
        }
      }
    ],
    "extends": "eslint:recommended",
    "parserOptions": {
        "ecmaVersion": "latest"
    },
    "rules": {
    }
}
