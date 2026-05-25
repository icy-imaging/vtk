// java wrapper for vtkGeneralTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeneralTransform extends vtkAbstractTransform
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

  private native void Concatenate_18(vtkMatrix4x4 id0);
  public void Concatenate(vtkMatrix4x4 id0)
  {
    Concatenate_18(id0);
  }

  private native void Concatenate_19(double id0[]);
  public void Concatenate(double id0[])
  {
    Concatenate_19(id0);
  }

  private native void Concatenate_20(vtkAbstractTransform id0);
  public void Concatenate(vtkAbstractTransform id0)
  {
    Concatenate_20(id0);
  }

  private native void PreMultiply_21();
  public void PreMultiply()
  {
    PreMultiply_21();
  }

  private native void PostMultiply_22();
  public void PostMultiply()
  {
    PostMultiply_22();
  }

  private native int GetNumberOfConcatenatedTransforms_23();
  public int GetNumberOfConcatenatedTransforms()
  {
    return GetNumberOfConcatenatedTransforms_23();
  }

  private native long GetConcatenatedTransform_24(int id0);
  public vtkAbstractTransform GetConcatenatedTransform(int id0)
  {
    long temp = GetConcatenatedTransform_24(id0);

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInput_25(vtkAbstractTransform id0);
  public void SetInput(vtkAbstractTransform id0)
  {
    SetInput_25(id0);
  }

  private native long GetInput_26();
  public vtkAbstractTransform GetInput()
  {
    long temp = GetInput_26();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetInverseFlag_27();
  public int GetInverseFlag()
  {
    return GetInverseFlag_27();
  }

  private native void Push_28();
  public void Push()
  {
    Push_28();
  }

  private native void Pop_29();
  public void Pop()
  {
    Pop_29();
  }

  private native void InternalTransformPoint_30(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_30(id0,id1);
  }

  private native void InternalTransformPoint_31(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_31(id0,id1);
  }

  private native int CircuitCheck_32(vtkAbstractTransform id0);
  public int CircuitCheck(vtkAbstractTransform id0)
  {
    return CircuitCheck_32(id0);
  }

  private native long MakeTransform_33();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_33();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_34();
  public long GetMTime()
  {
    return GetMTime_34();
  }

  public vtkGeneralTransform() { super(); }

  public vtkGeneralTransform(long id) { super(id); }
  public native long   VTKInit();

}
