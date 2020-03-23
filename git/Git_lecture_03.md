# git branch

1. `git branch`: 세계(branch) 나열 

2. `git branch [new]` : new라는 세계 생성 

3. `git switch [new]` : new 세계로 이동

   - git checkout [new] : 예전에는 checkout으로 이용함.

4. `git log --oneline` : 한번에 정보 확인 

5.  ***HEAD***는 현재위치의 **포인터** 역활.

   ```shell
   $ git log --oneline
   8a011a7 (HEAD -> master, new) add c.txt
   
   ```

6. **branch** 확인하는 방법 

   1. 프롬프트 확인
   2. git branch로 확인
   3. git log로 확인

7.  `git merge [병합을 할 branch]`

   - 병합을 할 곳으로 이동 후

   - 병합을 할 branch를 입력 

     > ex) 마스터로 이동한 후 병합 할 branch 입력

   - ```
     관리자 창으로 들어왔다면 esc키를 여러번 누른 후 `:wq` 키를 누르고 나온다.
     ```

8. `git log --oneline --graph` : branch를 그래픽으로 확인 가능하다.

9. https://git-school.github.io/visualizing-git/

   > branch 그리는 사이트

10. `git branch -d [지울 브랜치 이름]` : 병합후 브랜치 찌꺼기를 지움.

11. `git checkout -b [브랜치 이름] `: 브랜치 생성 후, 바로 브랜치로 이동. 

12. merge는 방법이 3가지가 있다.

    ###  1.Fast Forward Merge 

    브랜치 분기가 일어났지만, merge 시점에서 branch 한쪽에서만 commit들이 쌓여 있는 경우

    (ex. new에만 commit이 있고, master에는 없었을 때)

    ### 2. Auto-merge

    merge 시점에 양쪽 브랜치에 commit들이 쌓여 있지만, Conflict가 발생하지 않는 경우

    ### 3.Merge conflict 발생

    merge 시점에 양쪽 브랜치에 commit들이 쌓여 있지만, Conflict가 발생하는 경우 

    - 동일 파일 내에 상충하는 내용이 있을 경우

    - Conflict 발생시 화면

      ```shell
      <<<<<<< HEAD
      이건 master 브랜치에서 작업한 것 (master)
      =======
      이건 new 브랜치에서 작업한  것 (new)
      >>>>>>> new
      ```

      1. 임의로 선택하여 수정하고 add, commit 한다.

      2. git commit -m "Resolve merge conflict"
      3. 협업시 같은 코드파일은 동시에 안건드리는게 좋다.



12. `git merge new --no-ff` : Fast-forward를 하지 않겠다.

13. `git reset [주소]` : merge를 롤백 시킴 

14. `git switch -c new` : 브랜치를 만듦과 동시에 이동.

