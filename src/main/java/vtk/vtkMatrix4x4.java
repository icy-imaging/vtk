// java wrapper for vtkMatrix4x4 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMatrix4x4 extends vtkObject
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

  private native void DeepCopy_4(vtkMatrix4x4 id0);
  public void DeepCopy(vtkMatrix4x4 id0)
  {
    DeepCopy_4(id0);
  }

  private native void DeepCopy_5(double id0[],vtkMatrix4x4 id1);
  public void DeepCopy(double id0[],vtkMatrix4x4 id1)
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

  private native boolean IsIdentity_12();
  public boolean IsIdentity()
  {
    return IsIdentity_12();
  }

  private native void Invert_13(vtkMatrix4x4 id0,vtkMatrix4x4 id1);
  public void Invert(vtkMatrix4x4 id0,vtkMatrix4x4 id1)
  {
    Invert_13(id0,id1);
  }

  private native void Invert_14();
  public void Invert()
  {
    Invert_14();
  }

  private native void Invert_15(double id0[],double id1[]);
  public void Invert(double id0[],double id1[])
  {
    Invert_15(id0,id1);
  }

  private native void Transpose_16(vtkMatrix4x4 id0,vtkMatrix4x4 id1);
  public void Transpose(vtkMatrix4x4 id0,vtkMatrix4x4 id1)
  {
    Transpose_16(id0,id1);
  }

  private native void Transpose_17();
  public void Transpose()
  {
    Transpose_17();
  }

  private native void Transpose_18(double id0[],double id1[]);
  public void Transpose(double id0[],double id1[])
  {
    Transpose_18(id0,id1);
  }

  private native void MatrixFromRotation_19(double id0,double id1,double id2,double id3,vtkMatrix4x4 id4);
  public void MatrixFromRotation(double id0,double id1,double id2,double id3,vtkMatrix4x4 id4)
  {
    MatrixFromRotation_19(id0,id1,id2,id3,id4);
  }

  private native void MatrixFromRotation_20(double id0,double id1,double id2,double id3,double id4[]);
  public void MatrixFromRotation(double id0,double id1,double id2,double id3,double id4[])
  {
    MatrixFromRotation_20(id0,id1,id2,id3,id4);
  }

  private native void PoseToMatrix_21(double id0[],double id1[],vtkMatrix4x4 id2);
  public void PoseToMatrix(double id0[],double id1[],vtkMatrix4x4 id2)
  {
    PoseToMatrix_21(id0,id1,id2);
  }

  private native void MultiplyPoint_22(float id0[],float id1[]);
  public void MultiplyPoint(float id0[],float id1[])
  {
    MultiplyPoint_22(id0,id1);
  }

  private native void MultiplyPoint_23(double id0[],double id1[]);
  public void MultiplyPoint(double id0[],double id1[])
  {
    MultiplyPoint_23(id0,id1);
  }

  private native void MultiplyPoint_24(double id0[],float id1[],float id2[]);
  public void MultiplyPoint(double id0[],float id1[],float id2[])
  {
    MultiplyPoint_24(id0,id1,id2);
  }

  private native void MultiplyPoint_25(double id0[],double id1[],double id2[]);
  public void MultiplyPoint(double id0[],double id1[],double id2[])
  {
    MultiplyPoint_25(id0,id1,id2);
  }

  private native float[] MultiplyPoint_26(float id0[]);
  public float[] MultiplyPoint(float id0[])
  {
    return MultiplyPoint_26(id0);
  }

  private native double[] MultiplyPoint_27(double id0[]);
  public double[] MultiplyPoint(double id0[])
  {
    return MultiplyPoint_27(id0);
  }

  private native float[] MultiplyFloatPoint_28(float id0[]);
  public float[] MultiplyFloatPoint(float id0[])
  {
    return MultiplyFloatPoint_28(id0);
  }

  private native double[] MultiplyDoublePoint_29(double id0[]);
  public double[] MultiplyDoublePoint(double id0[])
  {
    return MultiplyDoublePoint_29(id0);
  }

  private native void Multiply4x4_30(vtkMatrix4x4 id0,vtkMatrix4x4 id1,vtkMatrix4x4 id2);
  public void Multiply4x4(vtkMatrix4x4 id0,vtkMatrix4x4 id1,vtkMatrix4x4 id2)
  {
    Multiply4x4_30(id0,id1,id2);
  }

  private native void Multiply4x4_31(double id0[],double id1[],double id2[]);
  public void Multiply4x4(double id0[],double id1[],double id2[])
  {
    Multiply4x4_31(id0,id1,id2);
  }

  private native void Multiply4x4_32(double id0[],double id1[],float id2[]);
  public void Multiply4x4(double id0[],double id1[],float id2[])
  {
    Multiply4x4_32(id0,id1,id2);
  }

  private native void MultiplyAndTranspose4x4_33(double id0[],double id1[],float id2[]);
  public void MultiplyAndTranspose4x4(double id0[],double id1[],float id2[])
  {
    MultiplyAndTranspose4x4_33(id0,id1,id2);
  }

  private native void Adjoint_34(vtkMatrix4x4 id0,vtkMatrix4x4 id1);
  public void Adjoint(vtkMatrix4x4 id0,vtkMatrix4x4 id1)
  {
    Adjoint_34(id0,id1);
  }

  private native void Adjoint_35(double id0[],double id1[]);
  public void Adjoint(double id0[],double id1[])
  {
    Adjoint_35(id0,id1);
  }

  private native double Determinant_36();
  public double Determinant()
  {
    return Determinant_36();
  }

  private native double Determinant_37(double id0[]);
  public double Determinant(double id0[])
  {
    return Determinant_37(id0);
  }

  private native void SetElement_38(int id0,int id1,double id2);
  public void SetElement(int id0,int id1,double id2)
  {
    SetElement_38(id0,id1,id2);
  }

  private native double GetElement_39(int id0,int id1);
  public double GetElement(int id0,int id1)
  {
    return GetElement_39(id0,id1);
  }

  private native double[] GetData_40();
  public double[] GetData()
  {
    return GetData_40();
  }

  private native void SetData_41(double id0[]);
  public void SetData(double id0[])
  {
    SetData_41(id0);
  }

  public vtkMatrix4x4() { super(); }

  public vtkMatrix4x4(long id) { super(id); }
  public native long   VTKInit();

}
