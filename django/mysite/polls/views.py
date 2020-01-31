from django.shortcuts import render
from django.http import HttpResponse
from .models import Question

def index(request):
    latest_question_list = Question.objects.order_by('-pub_date')[:10]
   
    return render(
        request,
     'polls/index.html',
      {
          'latest_question_list':latest_question_list
      })

    #list = Question.objects.order_by('-pub_date')[:10]
    #output = ','.join([q.question_text for q in list])
    
    #return HttpResponse(output)

def detail(request, question_id): # 질문 상세 페이지
    question = Question.objects.get(pk=question_id)
    return render(
        request, 'polls/detail.html',
        {'question' : question})
    #return HttpResponse("You're looking at question %s." % question_id)

def results(request, question_id): # 투표 결과 페이지
    response = "You're looking at the results of question %s."
    return HttpResponse(response % question_id)

def vote(request, question_id): # 투표 페이지
    return HttpResponse("You're voting on question %s." % question_id)

