// java wrapper for vtkShaderProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShaderProperty extends vtkObject
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

  private native void DeepCopy_4(vtkShaderProperty id0);
  public void DeepCopy(vtkShaderProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native long GetShaderMTime_5();
  public long GetShaderMTime()
  {
    return GetShaderMTime_5();
  }

  private native boolean HasVertexShaderCode_6();
  public boolean HasVertexShaderCode()
  {
    return HasVertexShaderCode_6();
  }

  private native boolean HasFragmentShaderCode_7();
  public boolean HasFragmentShaderCode()
  {
    return HasFragmentShaderCode_7();
  }

  private native boolean HasGeometryShaderCode_8();
  public boolean HasGeometryShaderCode()
  {
    return HasGeometryShaderCode_8();
  }

  private native boolean HasTessControlShaderCode_9();
  public boolean HasTessControlShaderCode()
  {
    return HasTessControlShaderCode_9();
  }

  private native boolean HasTessEvalShaderCode_10();
  public boolean HasTessEvalShaderCode()
  {
    return HasTessEvalShaderCode_10();
  }

  private native void SetVertexShaderCode_11(byte[] id0, int len0);
  public void SetVertexShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexShaderCode_11(bytes0, bytes0.length);
  }

  private native byte[] GetVertexShaderCode_12();
  public String GetVertexShaderCode()
  {
    return new String(GetVertexShaderCode_12(), StandardCharsets.UTF_8);
  }

  private native void SetFragmentShaderCode_13(byte[] id0, int len0);
  public void SetFragmentShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFragmentShaderCode_13(bytes0, bytes0.length);
  }

  private native byte[] GetFragmentShaderCode_14();
  public String GetFragmentShaderCode()
  {
    return new String(GetFragmentShaderCode_14(), StandardCharsets.UTF_8);
  }

  private native void SetGeometryShaderCode_15(byte[] id0, int len0);
  public void SetGeometryShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGeometryShaderCode_15(bytes0, bytes0.length);
  }

  private native byte[] GetGeometryShaderCode_16();
  public String GetGeometryShaderCode()
  {
    return new String(GetGeometryShaderCode_16(), StandardCharsets.UTF_8);
  }

  private native void SetTessControlShaderCode_17(byte[] id0, int len0);
  public void SetTessControlShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTessControlShaderCode_17(bytes0, bytes0.length);
  }

  private native byte[] GetTessControlShaderCode_18();
  public String GetTessControlShaderCode()
  {
    return new String(GetTessControlShaderCode_18(), StandardCharsets.UTF_8);
  }

  private native void SetTessEvaluationShaderCode_19(byte[] id0, int len0);
  public void SetTessEvaluationShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTessEvaluationShaderCode_19(bytes0, bytes0.length);
  }

  private native byte[] GetTessEvaluationShaderCode_20();
  public String GetTessEvaluationShaderCode()
  {
    return new String(GetTessEvaluationShaderCode_20(), StandardCharsets.UTF_8);
  }

  private native long GetFragmentCustomUniforms_21();
  public vtkUniforms GetFragmentCustomUniforms()
  {
    long temp = GetFragmentCustomUniforms_21();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexCustomUniforms_22();
  public vtkUniforms GetVertexCustomUniforms()
  {
    long temp = GetVertexCustomUniforms_22();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGeometryCustomUniforms_23();
  public vtkUniforms GetGeometryCustomUniforms()
  {
    long temp = GetGeometryCustomUniforms_23();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTessControlCustomUniforms_24();
  public vtkUniforms GetTessControlCustomUniforms()
  {
    long temp = GetTessControlCustomUniforms_24();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTessEvaluationCustomUniforms_25();
  public vtkUniforms GetTessEvaluationCustomUniforms()
  {
    long temp = GetTessEvaluationCustomUniforms_25();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddVertexShaderReplacement_26(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddVertexShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddVertexShaderReplacement_26(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddFragmentShaderReplacement_27(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddFragmentShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddFragmentShaderReplacement_27(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddGeometryShaderReplacement_28(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddGeometryShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddGeometryShaderReplacement_28(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddTessControlShaderReplacement_29(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddTessControlShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddTessControlShaderReplacement_29(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddTessEvaluationShaderReplacement_30(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddTessEvaluationShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddTessEvaluationShaderReplacement_30(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native int GetNumberOfShaderReplacements_31();
  public int GetNumberOfShaderReplacements()
  {
    return GetNumberOfShaderReplacements_31();
  }

  private native byte[] GetNthShaderReplacementTypeAsString_32(long id0);
  public String GetNthShaderReplacementTypeAsString(long id0)
  {
    return new String(GetNthShaderReplacementTypeAsString_32(id0), StandardCharsets.UTF_8);
  }

  private native void ClearVertexShaderReplacement_33(byte[] id0, int len0,boolean id1);
  public void ClearVertexShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearVertexShaderReplacement_33(bytes0, bytes0.length,id1);
  }

  private native void ClearFragmentShaderReplacement_34(byte[] id0, int len0,boolean id1);
  public void ClearFragmentShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearFragmentShaderReplacement_34(bytes0, bytes0.length,id1);
  }

  private native void ClearGeometryShaderReplacement_35(byte[] id0, int len0,boolean id1);
  public void ClearGeometryShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearGeometryShaderReplacement_35(bytes0, bytes0.length,id1);
  }

  private native void ClearTessControlShaderReplacement_36(byte[] id0, int len0,boolean id1);
  public void ClearTessControlShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearTessControlShaderReplacement_36(bytes0, bytes0.length,id1);
  }

  private native void ClearTessEvaluationShaderReplacement_37(byte[] id0, int len0,boolean id1);
  public void ClearTessEvaluationShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearTessEvaluationShaderReplacement_37(bytes0, bytes0.length,id1);
  }

  private native void ClearAllVertexShaderReplacements_38();
  public void ClearAllVertexShaderReplacements()
  {
    ClearAllVertexShaderReplacements_38();
  }

  private native void ClearAllFragmentShaderReplacements_39();
  public void ClearAllFragmentShaderReplacements()
  {
    ClearAllFragmentShaderReplacements_39();
  }

  private native void ClearAllGeometryShaderReplacements_40();
  public void ClearAllGeometryShaderReplacements()
  {
    ClearAllGeometryShaderReplacements_40();
  }

  private native void ClearAllTessControlShaderReplacements_41();
  public void ClearAllTessControlShaderReplacements()
  {
    ClearAllTessControlShaderReplacements_41();
  }

  private native void ClearAllTessEvalShaderReplacements_42();
  public void ClearAllTessEvalShaderReplacements()
  {
    ClearAllTessEvalShaderReplacements_42();
  }

  private native void ClearAllShaderReplacements_43();
  public void ClearAllShaderReplacements()
  {
    ClearAllShaderReplacements_43();
  }

  public vtkShaderProperty() { super(); }

  public vtkShaderProperty(long id) { super(id); }
  public native long   VTKInit();

}
