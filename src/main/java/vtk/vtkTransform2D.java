// java wrapper for vtkTransform2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransform2D extends vtkObject
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

  private native void Identity_4();
  public void Identity()
  {
    Identity_4();
  }

  private native void Inverse_5();
  public void Inverse()
  {
    Inverse_5();
  }

  private native void Translate_6(double id0,double id1);
  public void Translate(double id0,double id1)
  {
    Translate_6(id0,id1);
  }

  private native void Translate_7(double id0[]);
  public void Translate(double id0[])
  {
    Translate_7(id0);
  }

  private native void Translate_8(float id0[]);
  public void Translate(float id0[])
  {
    Translate_8(id0);
  }

  private native void Rotate_9(double id0);
  public void Rotate(double id0)
  {
    Rotate_9(id0);
  }

  private native void Scale_10(double id0,double id1);
  public void Scale(double id0,double id1)
  {
    Scale_10(id0,id1);
  }

  private native void Scale_11(double id0[]);
  public void Scale(double id0[])
  {
    Scale_11(id0);
  }

  private native void Scale_12(float id0[]);
  public void Scale(float id0[])
  {
    Scale_12(id0);
  }

  private native void SetMatrix_13(vtkMatrix3x3 id0);
  public void SetMatrix(vtkMatrix3x3 id0)
  {
    SetMatrix_13(id0);
  }

  private native void SetMatrix_14(double id0[]);
  public void SetMatrix(double id0[])
  {
    SetMatrix_14(id0);
  }

  private native long GetMatrix_15();
  public vtkMatrix3x3 GetMatrix()
  {
    long temp = GetMatrix_15();

    if (temp == 0) return null;
    return (vtkMatrix3x3)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetMatrix_16(vtkMatrix3x3 id0);
  public void GetMatrix(vtkMatrix3x3 id0)
  {
    GetMatrix_16(id0);
  }

  private native void GetPosition_17(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_17(id0);
  }

  private native void GetPosition_18(float id0[]);
  public void GetPosition(float id0[])
  {
    GetPosition_18(id0);
  }

  private native void GetScale_19(double id0[]);
  public void GetScale(double id0[])
  {
    GetScale_19(id0);
  }

  private native void GetScale_20(float id0[]);
  public void GetScale(float id0[])
  {
    GetScale_20(id0);
  }

  private native void GetInverse_21(vtkMatrix3x3 id0);
  public void GetInverse(vtkMatrix3x3 id0)
  {
    GetInverse_21(id0);
  }

  private native void GetTranspose_22(vtkMatrix3x3 id0);
  public void GetTranspose(vtkMatrix3x3 id0)
  {
    GetTranspose_22(id0);
  }

  private native long GetMTime_23();
  public long GetMTime()
  {
    return GetMTime_23();
  }

  private native void TransformPoints_24(vtkPoints2D id0,vtkPoints2D id1);
  public void TransformPoints(vtkPoints2D id0,vtkPoints2D id1)
  {
    TransformPoints_24(id0,id1);
  }

  private native void InverseTransformPoints_25(vtkPoints2D id0,vtkPoints2D id1);
  public void InverseTransformPoints(vtkPoints2D id0,vtkPoints2D id1)
  {
    InverseTransformPoints_25(id0,id1);
  }

  private native void MultiplyPoint_26(float id0[],float id1[]);
  public void MultiplyPoint(float id0[],float id1[])
  {
    MultiplyPoint_26(id0,id1);
  }

  private native void MultiplyPoint_27(double id0[],double id1[]);
  public void MultiplyPoint(double id0[],double id1[])
  {
    MultiplyPoint_27(id0,id1);
  }

  public vtkTransform2D() { super(); }

  public vtkTransform2D(long id) { super(id); }
  public native long   VTKInit();

}
