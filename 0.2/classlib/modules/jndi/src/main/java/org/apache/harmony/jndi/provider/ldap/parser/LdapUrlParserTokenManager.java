/* 
 *  Licensed to the Apache Software Foundation (ASF) under one or more 
 *  contributor license agreements.  See the NOTICE file distributed with 
 *  this work for additional information regarding copyright ownership. 
 *  The ASF licenses this file to You under the Apache License, Version 2.0 
 *  (the "License"); you may not use this file except in compliance with 
 *  the License.  You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 */
/* Generated By:JavaCC: Do not edit this line. LdapUrlParserTokenManager.java */
package org.apache.harmony.jndi.provider.ldap.parser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.StringReader;
import javax.naming.directory.SearchControls;
import org.apache.harmony.jndi.provider.ldap.Filter;
import org.apache.harmony.jndi.provider.ldap.asn1.Utils;

/** Token Manager. */
public class LdapUrlParserTokenManager implements LdapUrlParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 17);
      case 33:
         return jjStopAtPos(0, 10);
      case 37:
         return jjStopAtPos(0, 7);
      case 44:
         return jjStopAtPos(0, 4);
      case 46:
         return jjStopAtPos(0, 9);
      case 47:
         return jjStopAtPos(0, 6);
      case 48:
         return jjStopAtPos(0, 15);
      case 58:
         return jjStopAtPos(0, 8);
      case 61:
         return jjStopAtPos(0, 11);
      case 63:
         return jjStopAtPos(0, 5);
      case 133:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffdfL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 29;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fff7ffffffffbffL & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  break;
               case 0:
                  if (curChar == 45 && kind > 2)
                     kind = 2;
                  break;
               case 14:
                  if ((0x3fe000000000000L & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 15:
                  if ((0x7fff7ffffffffbffL & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 17:
                  if (curChar == 47 && kind > 1)
                     kind = 1;
                  break;
               case 18:
               case 23:
                  if (curChar == 47)
                     jjCheckNAdd(17);
                  break;
               case 19:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 24:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (kind > 16)
                     kind = 16;
                  if ((0x7ffff8007ffff80L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  else if ((0x7e0000007eL & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  if (curChar == 108)
                     jjAddStates(0, 1);
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 120)
                     jjCheckNAdd(0);
                  else if (curChar == 88)
                     jjCheckNAdd(0);
                  break;
               case 2:
                  if (curChar == 120)
                     jjCheckNAdd(0);
                  break;
               case 3:
                  if (curChar == 101 && kind > 3)
                     kind = 3;
                  break;
               case 4:
                  if (curChar == 115)
                     jjCheckNAdd(3);
                  break;
               case 5:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 110)
                     jjCheckNAdd(3);
                  break;
               case 8:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 98 && kind > 3)
                     kind = 3;
                  break;
               case 10:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x7e0000007eL & l) != 0L && kind > 12)
                     kind = 12;
                  break;
               case 13:
                  if ((0x7ffff8007ffff80L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 15:
                  if (kind > 16)
                     kind = 16;
                  break;
               case 16:
                  if (curChar == 108)
                     jjAddStates(0, 1);
                  break;
               case 20:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 25:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 16)
                     kind = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 29 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   22, 28, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\54", "\77", "\57", "\45", "\72", "\56", "\41", "\75", 
null, null, null, "\60", null, "\12", "\205", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[29];
private final int[] jjstateSet = new int[58];
protected char curChar;
/** Constructor. */
public LdapUrlParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LdapUrlParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 29; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
         matchedToken = jjFillToken();
         return matchedToken;
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
