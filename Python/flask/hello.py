from flask import Flask, escape, request, render_template
import random

app = Flask(__name__)


@app.route('/')
def hello():
    name = request.args.get("name", "World")
    return f'Hello, {escape(name)}!'

@app.route('/hi')
def hi():
    name = "조원상"
    return render_template('hi.html', html_name = name)

@app.route('/greeting/<string:name>/')
def greetiong(name):
    def_name = name
    return render_template('greeting.html', html_name = def_name)
    
@app.route('/cube/<int:num>')
def cube(num):
    cube_num = num**3
    return render_template('cube.html', cube = cube_num, num = num)

@app.route('/dinner')
def dinner():
    menu = ['삼각김밥', '컵라면', '스테이크', '마라탕', '훠궈']
    dinner = random.choice(menu)
    menu_img = {'삼각김밥' : 'https://pbs.twimg.com/profile_images/1112313550972678145/iT3wabux_400x400.png', 
                '컵라면' : 'https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile25.uf.tistory.com%2Fimage%2F99A7CB355A4B982A0381DD', 
                '스테이크' : 'https://m.mannabox.co.kr/images/detail/mannaboxplus/newsalchisteak/m_head.jpg', 
                '마라탕' : 'https://m.6recipe.co.kr/web/product/big/201812/14d85a8d77aadf64de92851bbf94259a.jpg', 
                '훠궈' : 'https://post-phinf.pstatic.net/MjAxOTA2MDNfMjQ4/MDAxNTU5NTQyNDAwMjIx.i4Wk5-2Is9kHOQ3qsxLJdORFBbzvxeu1a43cGbCTm0og.ZyodKeTW2B28ej546aEKjbGkFJncwIhcdue3TEFjJJQg.JPEG/%ED%9B%A0%EA%B6%881.jpg?type=w1200'
                }
    img_url = menu_img[dinner]
    return render_template('dinner.html', dinner = dinner, img_url = img_url)

@app.route('/movies')
def movies():
    movie = ['조커', '겨울왕국2', '터미네이터', '어벤져스']
    return render_template('movies.html', movies = movie)

if __name__ == "__main__":
    app.run(debug=True)
