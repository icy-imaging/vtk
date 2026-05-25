// java wrapper for vtkShaderProgram object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShaderProgram extends vtkObject
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

  private native long GetVertexShader_4();
  public vtkShader GetVertexShader()
  {
    long temp = GetVertexShader_4();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVertexShader_5(vtkShader id0);
  public void SetVertexShader(vtkShader id0)
  {
    SetVertexShader_5(id0);
  }

  private native long GetFragmentShader_6();
  public vtkShader GetFragmentShader()
  {
    long temp = GetFragmentShader_6();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFragmentShader_7(vtkShader id0);
  public void SetFragmentShader(vtkShader id0)
  {
    SetFragmentShader_7(id0);
  }

  private native long GetGeometryShader_8();
  public vtkShader GetGeometryShader()
  {
    long temp = GetGeometryShader_8();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometryShader_9(vtkShader id0);
  public void SetGeometryShader(vtkShader id0)
  {
    SetGeometryShader_9(id0);
  }

  private native long GetComputeShader_10();
  public vtkShader GetComputeShader()
  {
    long temp = GetComputeShader_10();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeShader_11(vtkShader id0);
  public void SetComputeShader(vtkShader id0)
  {
    SetComputeShader_11(id0);
  }

  private native long GetTessControlShader_12();
  public vtkShader GetTessControlShader()
  {
    long temp = GetTessControlShader_12();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTessControlShader_13(vtkShader id0);
  public void SetTessControlShader(vtkShader id0)
  {
    SetTessControlShader_13(id0);
  }

  private native long GetTessEvaluationShader_14();
  public vtkShader GetTessEvaluationShader()
  {
    long temp = GetTessEvaluationShader_14();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTessEvaluationShader_15(vtkShader id0);
  public void SetTessEvaluationShader(vtkShader id0)
  {
    SetTessEvaluationShader_15(id0);
  }

  private native long GetTransformFeedback_16();
  public vtkTransformFeedback GetTransformFeedback()
  {
    long temp = GetTransformFeedback_16();

    if (temp == 0) return null;
    return (vtkTransformFeedback)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransformFeedback_17(vtkTransformFeedback id0);
  public void SetTransformFeedback(vtkTransformFeedback id0)
  {
    SetTransformFeedback_17(id0);
  }

  private native boolean GetCompiled_18();
  public boolean GetCompiled()
  {
    return GetCompiled_18();
  }

  private native void SetCompiled_19(boolean id0);
  public void SetCompiled(boolean id0)
  {
    SetCompiled_19(id0);
  }

  private native void CompiledOn_20();
  public void CompiledOn()
  {
    CompiledOn_20();
  }

  private native void CompiledOff_21();
  public void CompiledOff()
  {
    CompiledOff_21();
  }

  private native byte[] GetMD5Hash_22();
  public String GetMD5Hash()
  {
    return new String(GetMD5Hash_22(), StandardCharsets.UTF_8);
  }

  private native void SetMD5Hash_23(byte[] id0, int len0);
  public void SetMD5Hash(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMD5Hash_23(bytes0, bytes0.length);
  }

  private native boolean isBound_24();
  public boolean isBound()
  {
    return isBound_24();
  }

  private native void ReleaseGraphicsResources_25(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_25(id0);
  }

  private native int GetHandle_26();
  public int GetHandle()
  {
    return GetHandle_26();
  }

  private native byte[] GetError_27();
  public String GetError()
  {
    return new String(GetError_27(), StandardCharsets.UTF_8);
  }

  private native boolean EnableAttributeArray_28(byte[] id0, int len0);
  public boolean EnableAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return EnableAttributeArray_28(bytes0, bytes0.length);
  }

  private native boolean DisableAttributeArray_29(byte[] id0, int len0);
  public boolean DisableAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return DisableAttributeArray_29(bytes0, bytes0.length);
  }

  private native boolean SetUniformi_30(byte[] id0, int len0,int id1);
  public boolean SetUniformi(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformi_30(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformf_31(byte[] id0, int len0,float id1);
  public boolean SetUniformf(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformf_31(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform2i_32(byte[] id0, int len0,int id1[]);
  public boolean SetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform2i_32(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform2f_33(byte[] id0, int len0,float id1[]);
  public boolean SetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform2f_33(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform3f_34(byte[] id0, int len0,float id1[]);
  public boolean SetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform3f_34(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform3f_35(byte[] id0, int len0,double id1[]);
  public boolean SetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform3f_35(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform4f_36(byte[] id0, int len0,float id1[]);
  public boolean SetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform4f_36(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformMatrix_37(byte[] id0, int len0,vtkMatrix3x3 id1);
  public boolean SetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformMatrix_37(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformMatrix_38(byte[] id0, int len0,vtkMatrix4x4 id1);
  public boolean SetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformMatrix_38(bytes0, bytes0.length,id1);
  }

  private native void SetNumberOfOutputs_39(int id0);
  public void SetNumberOfOutputs(int id0)
  {
    SetNumberOfOutputs_39(id0);
  }

  private native boolean Substitute_40(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,boolean id3);
  public boolean Substitute(String id0,String id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return Substitute_40(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native boolean Substitute_41(vtkShader id0,byte[] id1, int len1,byte[] id2, int len2,boolean id3);
  public boolean Substitute(vtkShader id0,String id1,String id2,boolean id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return Substitute_41(id0,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native boolean IsUniformUsed_42(byte[] id0, int len0);
  public boolean IsUniformUsed(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsUniformUsed_42(bytes0, bytes0.length);
  }

  private native boolean IsAttributeUsed_43(byte[] id0, int len0);
  public boolean IsAttributeUsed(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsAttributeUsed_43(bytes0, bytes0.length);
  }

  private native void SetFileNamePrefixForDebugging_44(byte[] id0, int len0);
  public void SetFileNamePrefixForDebugging(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileNamePrefixForDebugging_44(bytes0, bytes0.length);
  }

  private native byte[] GetFileNamePrefixForDebugging_45();
  public String GetFileNamePrefixForDebugging()
  {
    return new String(GetFileNamePrefixForDebugging_45(), StandardCharsets.UTF_8);
  }

  private native void SetUniformGroupUpdateTime_46(int id0,long id1);
  public void SetUniformGroupUpdateTime(int id0,long id1)
  {
    SetUniformGroupUpdateTime_46(id0,id1);
  }

  private native long GetUniformGroupUpdateTime_47(int id0);
  public long GetUniformGroupUpdateTime(int id0)
  {
    return GetUniformGroupUpdateTime_47(id0);
  }

  private native int FindUniform_48(byte[] id0, int len0);
  public int FindUniform(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindUniform_48(bytes0, bytes0.length);
  }

  private native int FindAttributeArray_49(byte[] id0, int len0);
  public int FindAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindAttributeArray_49(bytes0, bytes0.length);
  }

  public vtkShaderProgram() { super(); }

  public vtkShaderProgram(long id) { super(id); }
  public native long   VTKInit();

}
