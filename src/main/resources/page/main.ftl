<#import "template/temp.ftl" as m>
<@m.page>
    <form method="get">
        <input type="text" name="url" placeholder="вставьте ссылку на страницу">
        <button type="submit">Посчитать</button>
    </form>
    <div>
        ${message.word}
        ${message.quantity}
    </div>
</@m.page>