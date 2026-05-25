// java wrapper for vtkOpenGLShaderProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLShaderProperty extends vtkShaderProperty
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void DeepCopy_4(vtkOpenGLShaderProperty id0);
  public void DeepCopy(vtkOpenGLShaderProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native void AddVertexShaderReplacement_5(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddVertexShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddVertexShaderReplacement_5(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddFragmentShaderReplacement_6(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddFragmentShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddFragmentShaderReplacement_6(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddGeometryShaderReplacement_7(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddGeometryShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddGeometryShaderReplacement_7(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddTessControlShaderReplacement_8(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddTessControlShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddTessControlShaderReplacement_8(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddTessEvaluationShaderReplacement_9(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddTessEvaluationShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddTessEvaluationShaderReplacement_9(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native int GetNumberOfShaderReplacements_10();
  public int GetNumberOfShaderReplacements()
  {
    return GetNumberOfShaderReplacements_10();
  }

  private native byte[] GetNthShaderReplacementTypeAsString_11(long id0);
  public String GetNthShaderReplacementTypeAsString(long id0)
  {
    return new String(GetNthShaderReplacementTypeAsString_11(id0), StandardCharsets.UTF_8);
  }

  private native void ClearVertexShaderReplacement_12(byte[] id0, int len0,boolean id1);
  public void ClearVertexShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearVertexShaderReplacement_12(bytes0, bytes0.length,id1);
  }

  private native void ClearFragmentShaderReplacement_13(byte[] id0, int len0,boolean id1);
  public void ClearFragmentShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearFragmentShaderReplacement_13(bytes0, bytes0.length,id1);
  }

  private native void ClearGeometryShaderReplacement_14(byte[] id0, int len0,boolean id1);
  public void ClearGeometryShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearGeometryShaderReplacement_14(bytes0, bytes0.length,id1);
  }

  private native void ClearTessControlShaderReplacement_15(byte[] id0, int len0,boolean id1);
  public void ClearTessControlShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearTessControlShaderReplacement_15(bytes0, bytes0.length,id1);
  }

  private native void ClearTessEvaluationShaderReplacement_16(byte[] id0, int len0,boolean id1);
  public void ClearTessEvaluationShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearTessEvaluationShaderReplacement_16(bytes0, bytes0.length,id1);
  }

  private native void ClearAllVertexShaderReplacements_17();
  public void ClearAllVertexShaderReplacements()
  {
    ClearAllVertexShaderReplacements_17();
  }

  private native void ClearAllFragmentShaderReplacements_18();
  public void ClearAllFragmentShaderReplacements()
  {
    ClearAllFragmentShaderReplacements_18();
  }

  private native void ClearAllGeometryShaderReplacements_19();
  public void ClearAllGeometryShaderReplacements()
  {
    ClearAllGeometryShaderReplacements_19();
  }

  private native void ClearAllTessControlShaderReplacements_20();
  public void ClearAllTessControlShaderReplacements()
  {
    ClearAllTessControlShaderReplacements_20();
  }

  private native void ClearAllTessEvalShaderReplacements_21();
  public void ClearAllTessEvalShaderReplacements()
  {
    ClearAllTessEvalShaderReplacements_21();
  }

  private native void ClearAllShaderReplacements_22();
  public void ClearAllShaderReplacements()
  {
    ClearAllShaderReplacements_22();
  }

  private native void AddShaderReplacement_23(int id0,byte[] id1, int len1,boolean id2,byte[] id3, int len3,boolean id4);
  public void AddShaderReplacement(int id0,String id1,boolean id2,String id3,boolean id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    AddShaderReplacement_23(id0,bytes1, bytes1.length,id2,bytes3, bytes3.length,id4);
  }

  private native void ClearShaderReplacement_24(int id0,byte[] id1, int len1,boolean id2);
  public void ClearShaderReplacement(int id0,String id1,boolean id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    ClearShaderReplacement_24(id0,bytes1, bytes1.length,id2);
  }

  private native void ClearAllShaderReplacements_25(int id0);
  public void ClearAllShaderReplacements(int id0)
  {
    ClearAllShaderReplacements_25(id0);
  }

  public vtkOpenGLShaderProperty() { super(); }

  public vtkOpenGLShaderProperty(long id) { super(id); }
  public native long   VTKInit();

}
