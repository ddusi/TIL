# git rebase

git rebase는 commit을 합치거나 삭제하는 등 내 입맛대로 commit들을 제어하는 것이다.

## 1. Rebase란?

### 브랜치 병합 전략

두개의 브랜치가 존재할 때, 병합시 사용할 수 있는 방법은 두 가지이다.

1. Merge
2. Rebase

## Merge vs Rebase

merge를 사용할 지, Rebase를 사용할지는 프로젝트의 히스토리는 어떤 관점으로 보느냐에 따라 다르다.

### Merge의 히스토리

> 작업한 내용의 사실을 기록한 것

Merge로 브랜치를 병합하게 되면 커밋 내역에 Merge commit이 추가로 남는다. 따라서 Merge를 사용하면 브랜치가 생기고 병합되는 모든 작업 내용을 그대로 기록하게 된다.

### Rebase의 히스토리

> 내가 보여주고 싶은 것만 기록한 것

하지만 Rebase의 경우에는 브랜치를 병합할 때 이런 Merge commit을 남기지 않고, 내 입맛대로  commit을 만질 수 있기 때문에 남들에게 보여주고 싶은 모습만 보여 줄 수 있다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3bee58e1-2ac9-499a-b813-be3b6053ca34/image.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3bee58e1-2ac9-499a-b813-be3b6053ca34/image.png)

[ 참고 ]

[🎢 Git Rebase 활용하기](https://velog.io/@godori/Git-Rebase)

## 2. rebase 사용법

`$ git rebase -i [수정을 시작할 커밋의 이전 커밋]`  : 수정할 커밋들의 리스트가 출력 된다.

```
# Commands:
# p, pick <commit> = use commit
# r, reword <commit> = use commit, but edit the commit message
# e, edit <commit> = use commit, but stop for amending
# s, squash <commit> = use commit, but meld into previous commit
# f, fixup <commit> = like "squash", but discard this commit's log message
# x, exec <command> = run command (the rest of the line) using shell
# b, break = stop here (continue rebase later with 'git rebase --continue')
# d, drop <commit> = remove commit
# l, label <label> = label current HEAD with a name
# t, reset <label> = reset HEAD to a label
# m, merge [-C <commit> | -c <commit>] <label> [# <oneline>]
# .       create a merge commit using the original merge commit's
# .       message (or the oneline, if no original merge commit was
# .       specified). Use -c <commit> to reword the commit message.
```

- **Pick**

  pick은 커밋을 사용하겠다는 의미. 이를 이용해서 커밋의 순서를 바꿀 수도 있고, 커밋의 해쉬값을 이용해 특정 커밋을 가져올 수 도 있다.

- **reword**

- **edit**

- **Squash**

- **fixup**

- exec

- **drop**

# 주의사항

`git rebase` 는 이전의 커밋 히스토리를 변경하는 것이기 때문에 정말 조심해야한다. 그리고 만약 이미 github 원격저장소에 push한 상태라면 commit을 변경하더라도 저장이 안된다. 이때 써야 하는 명령어는 `$ git push --force` , `$ git push -f` 이다. 이 명령어를 쓴다면 이전의 커밋 히스토리를 강제로 덮어쓴다.

이런 상황에 만약 다른 개발자들과 공요하고 있던 커밋 히스토리의 불일치가 발생한다면 git이 꼬였다라는 상황이 발생할 수도 있기 때문에 rebase를 사용할땐 신중해야한다.

( git rebase를 사용 한다면 다른 협업자에게 동의를 구한 후 정리하고 다같이 맞춰서 해야할 듯 )

[ 참고 ]

[git rebase -i 사용하기](https://jupiny.com/2018/05/07/git-rebase-i-option/)

- **< rebase -i 편집을 vscode로 변경하는 법 >**

[ 참고 ]

[How to use Visual Studio Code as Default Editor for Git](https://stackoverflow.com/questions/30024353/how-to-use-visual-studio-code-as-default-editor-for-git)