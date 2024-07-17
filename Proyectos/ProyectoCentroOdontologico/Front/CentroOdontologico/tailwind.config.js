/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      colors:{
        blue_green:{
          50: '#6FE3DB',
          100: '#6FE3B3',
          200: '#6FC6E3',
          300: '#7AC5DF',
          400: '#6FA1E3',
          500: '#6F7DE3'
        }
      }
    },
  },
  plugins: [],
}
