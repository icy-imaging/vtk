// java wrapper for vtkTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransform extends vtkLinearTransform
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

  private native void Translate_6(double id0,double id1,double id2);
  public void Translate(double id0,double id1,double id2)
  {
    Translate_6(id0,id1,id2);
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

  private native void RotateWXYZ_9(double id0,double id1,double id2,double id3);
  public void RotateWXYZ(double id0,double id1,double id2,double id3)
  {
    RotateWXYZ_9(id0,id1,id2,id3);
  }

  private native void RotateWXYZ_10(double id0,double id1[]);
  public void RotateWXYZ(double id0,double id1[])
  {
    RotateWXYZ_10(id0,id1);
  }

  private native void RotateWXYZ_11(double id0,float id1[]);
  public void RotateWXYZ(double id0,float id1[])
  {
    RotateWXYZ_11(id0,id1);
  }

  private native void RotateX_12(double id0);
  public void RotateX(double id0)
  {
    RotateX_12(id0);
  }

  private native void RotateY_13(double id0);
  public void RotateY(double id0)
  {
    RotateY_13(id0);
  }

  private native void RotateZ_14(double id0);
  public void RotateZ(double id0)
  {
    RotateZ_14(id0);
  }

  private native void Scale_15(double id0,double id1,double id2);
  public void Scale(double id0,double id1,double id2)
  {
    Scale_15(id0,id1,id2);
  }

  private native void Scale_16(double id0[]);
  public void Scale(double id0[])
  {
    Scale_16(id0);
  }

  private native void Scale_17(float id0[]);
  public void Scale(float id0[])
  {
    Scale_17(id0);
  }

  private native void SetMatrix_18(vtkMatrix4x4 id0);
  public void SetMatrix(vtkMatrix4x4 id0)
  {
    SetMatrix_18(id0);
  }

  private native void SetMatrix_19(double id0[]);
  public void SetMatrix(double id0[])
  {
    SetMatrix_19(id0);
  }

  private native void Concatenate_20(vtkMatrix4x4 id0);
  public void Concatenate(vtkMatrix4x4 id0)
  {
    Concatenate_20(id0);
  }

  private native void Concatenate_21(double id0[]);
  public void Concatenate(double id0[])
  {
    Concatenate_21(id0);
  }

  private native void Concatenate_22(vtkLinearTransform id0);
  public void Concatenate(vtkLinearTransform id0)
  {
    Concatenate_22(id0);
  }

  private native void PreMultiply_23();
  public void PreMultiply()
  {
    PreMultiply_23();
  }

  private native void PostMultiply_24();
  public void PostMultiply()
  {
    PostMultiply_24();
  }

  private native int GetNumberOfConcatenatedTransforms_25();
  public int GetNumberOfConcatenatedTransforms()
  {
    return GetNumberOfConcatenatedTransforms_25();
  }

  private native long GetConcatenatedTransform_26(int id0);
  public vtkLinearTransform GetConcatenatedTransform(int id0)
  {
    long temp = GetConcatenatedTransform_26(id0);

    if (temp == 0) return null;
    return (vtkLinearTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetOrientation_27(double id0[]);
  public void GetOrientation(double id0[])
  {
    GetOrientation_27(id0);
  }

  private native void GetOrientation_28(float id0[]);
  public void GetOrientation(float id0[])
  {
    GetOrientation_28(id0);
  }

  private native double[] GetOrientation_29();
  public double[] GetOrientation()
  {
    return GetOrientation_29();
  }

  private native void GetOrientation_30(double id0[],vtkMatrix4x4 id1);
  public void GetOrientation(double id0[],vtkMatrix4x4 id1)
  {
    GetOrientation_30(id0,id1);
  }

  private native void GetOrientationWXYZ_31(double id0[]);
  public void GetOrientationWXYZ(double id0[])
  {
    GetOrientationWXYZ_31(id0);
  }

  private native void GetOrientationWXYZ_32(float id0[]);
  public void GetOrientationWXYZ(float id0[])
  {
    GetOrientationWXYZ_32(id0);
  }

  private native double[] GetOrientationWXYZ_33();
  public double[] GetOrientationWXYZ()
  {
    return GetOrientationWXYZ_33();
  }

  private native void GetPosition_34(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_34(id0);
  }

  private native void GetPosition_35(float id0[]);
  public void GetPosition(float id0[])
  {
    GetPosition_35(id0);
  }

  private native double[] GetPosition_36();
  public double[] GetPosition()
  {
    return GetPosition_36();
  }

  private native void GetScale_37(double id0[]);
  public void GetScale(double id0[])
  {
    GetScale_37(id0);
  }

  private native void GetScale_38(float id0[]);
  public void GetScale(float id0[])
  {
    GetScale_38(id0);
  }

  private native double[] GetScale_39();
  public double[] GetScale()
  {
    return GetScale_39();
  }

  private native void GetInverse_40(vtkMatrix4x4 id0);
  public void GetInverse(vtkMatrix4x4 id0)
  {
    GetInverse_40(id0);
  }

  private native void GetTranspose_41(vtkMatrix4x4 id0);
  public void GetTranspose(vtkMatrix4x4 id0)
  {
    GetTranspose_41(id0);
  }

  private native void SetInput_42(vtkLinearTransform id0);
  public void SetInput(vtkLinearTransform id0)
  {
    SetInput_42(id0);
  }

  private native long GetInput_43();
  public vtkLinearTransform GetInput()
  {
    long temp = GetInput_43();

    if (temp == 0) return null;
    return (vtkLinearTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetInverseFlag_44();
  public int GetInverseFlag()
  {
    return GetInverseFlag_44();
  }

  private native void Push_45();
  public void Push()
  {
    Push_45();
  }

  private native void Pop_46();
  public void Pop()
  {
    Pop_46();
  }

  private native int CircuitCheck_47(vtkAbstractTransform id0);
  public int CircuitCheck(vtkAbstractTransform id0)
  {
    return CircuitCheck_47(id0);
  }

  private native long GetInverse_48();
  public vtkAbstractTransform GetInverse()
  {
    long temp = GetInverse_48();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MakeTransform_49();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_49();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_50();
  public long GetMTime()
  {
    return GetMTime_50();
  }

  private native void MultiplyPoint_51(float id0[],float id1[]);
  public void MultiplyPoint(float id0[],float id1[])
  {
    MultiplyPoint_51(id0,id1);
  }

  private native void MultiplyPoint_52(double id0[],double id1[]);
  public void MultiplyPoint(double id0[],double id1[])
  {
    MultiplyPoint_52(id0,id1);
  }

  public vtkTransform() { super(); }

  public vtkTransform(long id) { super(id); }
  public native long   VTKInit();

}
