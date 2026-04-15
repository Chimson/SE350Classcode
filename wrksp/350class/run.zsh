if [[ "$1" == "" ]]; then 
  echo "Need to give a pkg.class!"
else  
  javac -d bin src/**/*.java
  java -cp bin "$1"
fi
