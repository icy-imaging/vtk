// java wrapper for vtkUniforms object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniforms extends vtkObject
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

  private native long GetUniformListMTime_4();
  public long GetUniformListMTime()
  {
    return GetUniformListMTime_4();
  }

  private native byte[] TupleTypeToString_5(int id0);
  public String TupleTypeToString(int id0)
  {
    return new String(TupleTypeToString_5(id0), StandardCharsets.UTF_8);
  }

  private native int StringToTupleType_6(byte[] id0, int len0);
  public int StringToTupleType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return StringToTupleType_6(bytes0, bytes0.length);
  }

  private native byte[] ScalarTypeToString_7(int id0);
  public String ScalarTypeToString(int id0)
  {
    return new String(ScalarTypeToString_7(id0), StandardCharsets.UTF_8);
  }

  private native int StringToScalarType_8(byte[] id0, int len0);
  public int StringToScalarType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return StringToScalarType_8(bytes0, bytes0.length);
  }

  private native void RemoveUniform_9(byte[] id0, int len0);
  public void RemoveUniform(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveUniform_9(bytes0, bytes0.length);
  }

  private native void RemoveAllUniforms_10();
  public void RemoveAllUniforms()
  {
    RemoveAllUniforms_10();
  }

  private native void SetUniformi_11(byte[] id0, int len0,int id1);
  public void SetUniformi(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformi_11(bytes0, bytes0.length,id1);
  }

  private native void SetUniformf_12(byte[] id0, int len0,float id1);
  public void SetUniformf(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformf_12(bytes0, bytes0.length,id1);
  }

  private native void SetUniform2i_13(byte[] id0, int len0,int id1[]);
  public void SetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform2i_13(bytes0, bytes0.length,id1);
  }

  private native void SetUniform2f_14(byte[] id0, int len0,float id1[]);
  public void SetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform2f_14(bytes0, bytes0.length,id1);
  }

  private native void SetUniform3f_15(byte[] id0, int len0,float id1[]);
  public void SetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform3f_15(bytes0, bytes0.length,id1);
  }

  private native void SetUniform4f_16(byte[] id0, int len0,float id1[]);
  public void SetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform4f_16(bytes0, bytes0.length,id1);
  }

  private native void SetUniform3f_17(byte[] id0, int len0,double id1[]);
  public void SetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniform3f_17(bytes0, bytes0.length,id1);
  }

  private native void SetUniformMatrix_18(byte[] id0, int len0,vtkMatrix3x3 id1);
  public void SetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformMatrix_18(bytes0, bytes0.length,id1);
  }

  private native void SetUniformMatrix_19(byte[] id0, int len0,vtkMatrix4x4 id1);
  public void SetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUniformMatrix_19(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform2i_20(byte[] id0, int len0,int id1[]);
  public boolean GetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform2i_20(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform2f_21(byte[] id0, int len0,float id1[]);
  public boolean GetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform2f_21(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform3f_22(byte[] id0, int len0,float id1[]);
  public boolean GetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform3f_22(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform4f_23(byte[] id0, int len0,float id1[]);
  public boolean GetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform4f_23(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniform3f_24(byte[] id0, int len0,double id1[]);
  public boolean GetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniform3f_24(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniformMatrix_25(byte[] id0, int len0,vtkMatrix3x3 id1);
  public boolean GetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformMatrix_25(bytes0, bytes0.length,id1);
  }

  private native boolean GetUniformMatrix_26(byte[] id0, int len0,vtkMatrix4x4 id1);
  public boolean GetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformMatrix_26(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfUniforms_27();
  public int GetNumberOfUniforms()
  {
    return GetNumberOfUniforms_27();
  }

  private native byte[] GetNthUniformName_28(long id0);
  public String GetNthUniformName(long id0)
  {
    return new String(GetNthUniformName_28(id0), StandardCharsets.UTF_8);
  }

  private native int GetUniformScalarType_29(byte[] id0, int len0);
  public int GetUniformScalarType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformScalarType_29(bytes0, bytes0.length);
  }

  private native int GetUniformTupleType_30(byte[] id0, int len0);
  public int GetUniformTupleType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformTupleType_30(bytes0, bytes0.length);
  }

  private native int GetUniformNumberOfComponents_31(byte[] id0, int len0);
  public int GetUniformNumberOfComponents(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformNumberOfComponents_31(bytes0, bytes0.length);
  }

  private native int GetUniformNumberOfTuples_32(byte[] id0, int len0);
  public int GetUniformNumberOfTuples(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetUniformNumberOfTuples_32(bytes0, bytes0.length);
  }

  public vtkUniforms() { super(); }

  public vtkUniforms(long id) { super(id); }
  public native long   VTKInit();

}
