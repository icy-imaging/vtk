// java wrapper for vtkMatrix3x3 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMatrix3x3 extends vtkObject
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

  private native void DeepCopy_4(vtkMatrix3x3 id0);
  public void DeepCopy(vtkMatrix3x3 id0)
  {
    DeepCopy_4(id0);
  }

  private native void DeepCopy_5(double id0[],vtkMatrix3x3 id1);
  public void DeepCopy(double id0[],vtkMatrix3x3 id1)
  {
    DeepCopy_5(id0,id1);
  }

  private native void DeepCopy_6(double id0[],double id1[]);
  public void DeepCopy(double id0[],double id1[])
  {
    DeepCopy_6(id0,id1);
  }

  private native void DeepCopy_7(double id0[]);
  public void DeepCopy(double id0[])
  {
    DeepCopy_7(id0);
  }

  private native void Zero_8();
  public void Zero()
  {
    Zero_8();
  }

  private native void Zero_9(double id0[]);
  public void Zero(double id0[])
  {
    Zero_9(id0);
  }

  private native void Identity_10();
  public void Identity()
  {
    Identity_10();
  }

  private native void Identity_11(double id0[]);
  public void Identity(double id0[])
  {
    Identity_11(id0);
  }

  private native void Invert_12(vtkMatrix3x3 id0,vtkMatrix3x3 id1);
  public void Invert(vtkMatrix3x3 id0,vtkMatrix3x3 id1)
  {
    Invert_12(id0,id1);
  }

  private native void Invert_13();
  public void Invert()
  {
    Invert_13();
  }

  private native void Invert_14(double id0[],double id1[]);
  public void Invert(double id0[],double id1[])
  {
    Invert_14(id0,id1);
  }

  private native void Transpose_15(vtkMatrix3x3 id0,vtkMatrix3x3 id1);
  public void Transpose(vtkMatrix3x3 id0,vtkMatrix3x3 id1)
  {
    Transpose_15(id0,id1);
  }

  private native void Transpose_16();
  public void Transpose()
  {
    Transpose_16();
  }

  private native void Transpose_17(double id0[],double id1[]);
  public void Transpose(double id0[],double id1[])
  {
    Transpose_17(id0,id1);
  }

  private native void MultiplyPoint_18(float id0[],float id1[]);
  public void MultiplyPoint(float id0[],float id1[])
  {
    MultiplyPoint_18(id0,id1);
  }

  private native void MultiplyPoint_19(double id0[],double id1[]);
  public void MultiplyPoint(double id0[],double id1[])
  {
    MultiplyPoint_19(id0,id1);
  }

  private native void MultiplyPoint_20(double id0[],float id1[],float id2[]);
  public void MultiplyPoint(double id0[],float id1[],float id2[])
  {
    MultiplyPoint_20(id0,id1,id2);
  }

  private native void MultiplyPoint_21(double id0[],double id1[],double id2[]);
  public void MultiplyPoint(double id0[],double id1[],double id2[])
  {
    MultiplyPoint_21(id0,id1,id2);
  }

  private native void Multiply3x3_22(vtkMatrix3x3 id0,vtkMatrix3x3 id1,vtkMatrix3x3 id2);
  public void Multiply3x3(vtkMatrix3x3 id0,vtkMatrix3x3 id1,vtkMatrix3x3 id2)
  {
    Multiply3x3_22(id0,id1,id2);
  }

  private native void Multiply3x3_23(double id0[],double id1[],double id2[]);
  public void Multiply3x3(double id0[],double id1[],double id2[])
  {
    Multiply3x3_23(id0,id1,id2);
  }

  private native void Adjoint_24(vtkMatrix3x3 id0,vtkMatrix3x3 id1);
  public void Adjoint(vtkMatrix3x3 id0,vtkMatrix3x3 id1)
  {
    Adjoint_24(id0,id1);
  }

  private native void Adjoint_25(double id0[],double id1[]);
  public void Adjoint(double id0[],double id1[])
  {
    Adjoint_25(id0,id1);
  }

  private native double Determinant_26();
  public double Determinant()
  {
    return Determinant_26();
  }

  private native double Determinant_27(double id0[]);
  public double Determinant(double id0[])
  {
    return Determinant_27(id0);
  }

  private native void SetElement_28(int id0,int id1,double id2);
  public void SetElement(int id0,int id1,double id2)
  {
    SetElement_28(id0,id1,id2);
  }

  private native double GetElement_29(int id0,int id1);
  public double GetElement(int id0,int id1)
  {
    return GetElement_29(id0,id1);
  }

  private native boolean IsIdentity_30();
  public boolean IsIdentity()
  {
    return IsIdentity_30();
  }

  private native double[] GetData_31();
  public double[] GetData()
  {
    return GetData_31();
  }

  private native void SetData_32(double id0[]);
  public void SetData(double id0[])
  {
    SetData_32(id0);
  }

  public vtkMatrix3x3() { super(); }

  public vtkMatrix3x3(long id) { super(id); }
  public native long   VTKInit();

}
