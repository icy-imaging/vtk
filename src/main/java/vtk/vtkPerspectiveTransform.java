// java wrapper for vtkPerspectiveTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPerspectiveTransform extends vtkHomogeneousTransform
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

  private native void AdjustViewport_6(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7);
  public void AdjustViewport(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7)
  {
    AdjustViewport_6(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void AdjustZBuffer_7(double id0,double id1,double id2,double id3);
  public void AdjustZBuffer(double id0,double id1,double id2,double id3)
  {
    AdjustZBuffer_7(id0,id1,id2,id3);
  }

  private native void Ortho_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void Ortho(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    Ortho_8(id0,id1,id2,id3,id4,id5);
  }

  private native void Frustum_9(double id0,double id1,double id2,double id3,double id4,double id5);
  public void Frustum(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    Frustum_9(id0,id1,id2,id3,id4,id5);
  }

  private native void Perspective_10(double id0,double id1,double id2,double id3);
  public void Perspective(double id0,double id1,double id2,double id3)
  {
    Perspective_10(id0,id1,id2,id3);
  }

  private native void Shear_11(double id0,double id1,double id2);
  public void Shear(double id0,double id1,double id2)
  {
    Shear_11(id0,id1,id2);
  }

  private native void Stereo_12(double id0,double id1);
  public void Stereo(double id0,double id1)
  {
    Stereo_12(id0,id1);
  }

  private native void SetupCamera_13(double id0[],double id1[],double id2[]);
  public void SetupCamera(double id0[],double id1[],double id2[])
  {
    SetupCamera_13(id0,id1,id2);
  }

  private native void SetupCamera_14(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void SetupCamera(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    SetupCamera_14(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void Translate_15(double id0,double id1,double id2);
  public void Translate(double id0,double id1,double id2)
  {
    Translate_15(id0,id1,id2);
  }

  private native void Translate_16(double id0[]);
  public void Translate(double id0[])
  {
    Translate_16(id0);
  }

  private native void Translate_17(float id0[]);
  public void Translate(float id0[])
  {
    Translate_17(id0);
  }

  private native void RotateWXYZ_18(double id0,double id1,double id2,double id3);
  public void RotateWXYZ(double id0,double id1,double id2,double id3)
  {
    RotateWXYZ_18(id0,id1,id2,id3);
  }

  private native void RotateWXYZ_19(double id0,double id1[]);
  public void RotateWXYZ(double id0,double id1[])
  {
    RotateWXYZ_19(id0,id1);
  }

  private native void RotateWXYZ_20(double id0,float id1[]);
  public void RotateWXYZ(double id0,float id1[])
  {
    RotateWXYZ_20(id0,id1);
  }

  private native void RotateX_21(double id0);
  public void RotateX(double id0)
  {
    RotateX_21(id0);
  }

  private native void RotateY_22(double id0);
  public void RotateY(double id0)
  {
    RotateY_22(id0);
  }

  private native void RotateZ_23(double id0);
  public void RotateZ(double id0)
  {
    RotateZ_23(id0);
  }

  private native void Scale_24(double id0,double id1,double id2);
  public void Scale(double id0,double id1,double id2)
  {
    Scale_24(id0,id1,id2);
  }

  private native void Scale_25(double id0[]);
  public void Scale(double id0[])
  {
    Scale_25(id0);
  }

  private native void Scale_26(float id0[]);
  public void Scale(float id0[])
  {
    Scale_26(id0);
  }

  private native void SetMatrix_27(vtkMatrix4x4 id0);
  public void SetMatrix(vtkMatrix4x4 id0)
  {
    SetMatrix_27(id0);
  }

  private native void SetMatrix_28(double id0[]);
  public void SetMatrix(double id0[])
  {
    SetMatrix_28(id0);
  }

  private native void Concatenate_29(vtkMatrix4x4 id0);
  public void Concatenate(vtkMatrix4x4 id0)
  {
    Concatenate_29(id0);
  }

  private native void Concatenate_30(double id0[]);
  public void Concatenate(double id0[])
  {
    Concatenate_30(id0);
  }

  private native void Concatenate_31(vtkHomogeneousTransform id0);
  public void Concatenate(vtkHomogeneousTransform id0)
  {
    Concatenate_31(id0);
  }

  private native void PreMultiply_32();
  public void PreMultiply()
  {
    PreMultiply_32();
  }

  private native void PostMultiply_33();
  public void PostMultiply()
  {
    PostMultiply_33();
  }

  private native int GetNumberOfConcatenatedTransforms_34();
  public int GetNumberOfConcatenatedTransforms()
  {
    return GetNumberOfConcatenatedTransforms_34();
  }

  private native long GetConcatenatedTransform_35(int id0);
  public vtkHomogeneousTransform GetConcatenatedTransform(int id0)
  {
    long temp = GetConcatenatedTransform_35(id0);

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInput_36(vtkHomogeneousTransform id0);
  public void SetInput(vtkHomogeneousTransform id0)
  {
    SetInput_36(id0);
  }

  private native long GetInput_37();
  public vtkHomogeneousTransform GetInput()
  {
    long temp = GetInput_37();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetInverseFlag_38();
  public int GetInverseFlag()
  {
    return GetInverseFlag_38();
  }

  private native void Push_39();
  public void Push()
  {
    Push_39();
  }

  private native void Pop_40();
  public void Pop()
  {
    Pop_40();
  }

  private native long MakeTransform_41();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_41();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CircuitCheck_42(vtkAbstractTransform id0);
  public int CircuitCheck(vtkAbstractTransform id0)
  {
    return CircuitCheck_42(id0);
  }

  private native long GetMTime_43();
  public long GetMTime()
  {
    return GetMTime_43();
  }

  public vtkPerspectiveTransform() { super(); }

  public vtkPerspectiveTransform(long id) { super(id); }
  public native long   VTKInit();

}
