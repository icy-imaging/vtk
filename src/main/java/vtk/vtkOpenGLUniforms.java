// java wrapper for vtkOpenGLUniforms object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLUniforms extends vtkUniforms
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

  private native byte[] GetDeclarations_4();
  public String GetDeclarations()
  {
    return new String(GetDeclarations_4(), StandardCharsets.UTF_8);
  }

  private native boolean SetUniforms_5(vtkShaderProgram id0);
  public boolean SetUniforms(vtkShaderProgram id0)
  {
    return SetUniforms_5(id0);
  }

  private native long GetUniformListMTime_6();
  public long GetUniformListMTime()
  {
    return GetUniformListMTime_6();
  }

  private native void RemoveUniform_7(byte[] id0, int len0);
  public void RemoveUniform(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveUniform_7(bytes0, bytes0.length);
  }

  private native void RemoveAllUniforms_8();
  public void RemoveAllUniforms()
  {
    RemoveAllUniforms_8();
  }

  private native void SetUniformi_9(byte[] id0, int len0,int id1);
  public void SetUniformi(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformi_9(bytes0, bytes0.length,id1);
  }

  private native void SetUniformf_10(byte[] id0, int len0,float id1);
  public void SetUniformf(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformf_10(bytes0, bytes0.length,id1);
  }

  private native void SetUniform2i_11(byte[] id0, int len0,int id1[]);
  public void SetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform2i_11(bytes0, bytes0.length,id1);
  }

  private native void SetUniform2f_12(byte[] id0, int len0,float id1[]);
  public void SetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform2f_12(bytes0, bytes0.length,id1);
  }

  private native void SetUniform3f_13(byte[] id0, int len0,float id1[]);
  public void SetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform3f_13(bytes0, bytes0.length,id1);
  }

  private native void SetUniform4f_14(byte[] id0, int len0,float id1[]);
  public void SetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform4f_14(bytes0, bytes0.length,id1);
  }

  private native void SetUniform3f_15(byte[] id0, int len0,double id1[]);
  public void SetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform3f_15(bytes0, bytes0.length,id1);
  }

  private native void SetUniformMatrix_16(byte[] id0, int len0,vtkMatrix3x3 id1);
  public void SetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformMatrix_16(bytes0, bytes0.length,id1);
  }

  private native void SetUniformMatrix_17(byte[] id0, int len0,vtkMatrix4x4 id1);
  public void SetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformMatrix_17(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform2i_18(byte[] id0, int len0,int id1[]);
  public boolean GetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform2i_18(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform2f_19(byte[] id0, int len0,float id1[]);
  public boolean GetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform2f_19(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform3f_20(byte[] id0, int len0,float id1[]);
  public boolean GetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform3f_20(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform4f_21(byte[] id0, int len0,float id1[]);
  public boolean GetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform4f_21(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform3f_22(byte[] id0, int len0,double id1[]);
  public boolean GetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform3f_22(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniformMatrix_23(byte[] id0, int len0,vtkMatrix3x3 id1);
  public boolean GetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformMatrix_23(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniformMatrix_24(byte[] id0, int len0,vtkMatrix4x4 id1);
  public boolean GetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformMatrix_24(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfUniforms_25();
  public int GetNumberOfUniforms()
  {
    return GetNumberOfUniforms_25();
  }

  private native byte[] GetNthUniformName_26(long id0);
  public String GetNthUniformName(long id0)
  {
    return new String(GetNthUniformName_26(id0), StandardCharsets.UTF_8);
  }

  private native int GetUniformScalarType_27(byte[] id0, int len0);
  public int GetUniformScalarType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformScalarType_27(bytes0, bytes0.length);
  }

  private native int GetUniformNumberOfComponents_28(byte[] id0, int len0);
  public int GetUniformNumberOfComponents(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformNumberOfComponents_28(bytes0, bytes0.length);
  }

  private native int GetUniformNumberOfTuples_29(byte[] id0, int len0);
  public int GetUniformNumberOfTuples(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformNumberOfTuples_29(bytes0, bytes0.length);
  }

  public vtkOpenGLUniforms() { super(); }

  public vtkOpenGLUniforms(long id) { super(id); }
  public native long   VTKInit();

}
