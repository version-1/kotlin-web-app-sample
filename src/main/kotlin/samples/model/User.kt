package samples.model

/**
 * Created by version1 on 2017/02/11.
 */

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * bookテーブルのEntity.
 * @param id 主キー
 * @param title 書籍名
 * @param subTitle 書籍の副題 ない場合はnull
 * @param leadingSentence リード文
 * @param url リンク先URLパス
 */
@Entity
@Table(name = "users")
data class User(@Id @GeneratedValue var id: Int? = 0,
                @Column(nullable = false) var name: String = "",
                @Column var age: Int? = 0,
                @Column(nullable = false) var sex: Int = 0) {
}


