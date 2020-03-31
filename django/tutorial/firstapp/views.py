from django.shortcuts import render
from django.http import HttpResponse
from firstapp.models import Curriculum
import pymysql

def index1(request):
 return HttpResponse('<h1>Hello</h1>')

def index2(request):
 return HttpResponse('<h1>Hi</h1>')
 
def main(request):
    list = Curriculum.objects.all()
    html = ''
    for cur in list:
        html += cur.name + '<br>'

    return render(request, 'firstapp/main.html', {'list':list})

def show(request):
    try:
        conn = pymysql.connect(
        host='localhost', user='root', password='123',
        db='pythondb', charset='utf8')

        with conn.cursor(pymysql.cursors.DictCursor) as cursor:
            sql = '''SELECT * FROM shop'''
            cursor.execute(sql)
            
            result = cursor.fetchall()
            # for row in result:
            #     print(row, type(row))
    except pymysql.InternalError as e:
        print('InternalError', e)
    except pymysql.ProgrammingError as e:
        print('programmingError', e)
    finally:
        conn.close()

    return render(request, 'firstapp/show.html', {'result':result}) 