// java wrapper for vtkProp3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProp3D extends vtkProp
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

  private native void ShallowCopy_4(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_4(id0);
  }

  private native void SetPosition_5(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_5(id0,id1,id2);
  }

  private native void SetPosition_6(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_6(id0);
  }

  private native double[] GetPosition_7();
  public double[] GetPosition()
  {
    return GetPosition_7();
  }

  private native void AddPosition_8(double id0[]);
  public void AddPosition(double id0[])
  {
    AddPosition_8(id0);
  }

  private native void AddPosition_9(double id0,double id1,double id2);
  public void AddPosition(double id0,double id1,double id2)
  {
    AddPosition_9(id0,id1,id2);
  }

  private native void SetOrigin_10(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_10(id0,id1,id2);
  }

  private native void SetOrigin_11(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_11(id0);
  }

  private native double[] GetOrigin_12();
  public double[] GetOrigin()
  {
    return GetOrigin_12();
  }

  private native void SetScale_13(double id0,double id1,double id2);
  public void SetScale(double id0,double id1,double id2)
  {
    SetScale_13(id0,id1,id2);
  }

  private native void SetScale_14(double id0[]);
  public void SetScale(double id0[])
  {
    SetScale_14(id0);
  }

  private native double[] GetScale_15();
  public double[] GetScale()
  {
    return GetScale_15();
  }

  private native void SetScale_16(double id0);
  public void SetScale(double id0)
  {
    SetScale_16(id0);
  }

  private native void SetUserTransform_17(vtkLinearTransform id0);
  public void SetUserTransform(vtkLinearTransform id0)
  {
    SetUserTransform_17(id0);
  }

  private native long GetUserTransform_18();
  public vtkLinearTransform GetUserTransform()
  {
    long temp = GetUserTransform_18();

    if (temp == 0) return null;
    return (vtkLinearTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserMatrix_19(vtkMatrix4x4 id0);
  public void SetUserMatrix(vtkMatrix4x4 id0)
  {
    SetUserMatrix_19(id0);
  }

  private native long GetUserMatrix_20();
  public vtkMatrix4x4 GetUserMatrix()
  {
    long temp = GetUserMatrix_20();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetMatrix_21(vtkMatrix4x4 id0);
  public void GetMatrix(vtkMatrix4x4 id0)
  {
    GetMatrix_21(id0);
  }

  private native void GetMatrix_22(double id0[]);
  public void GetMatrix(double id0[])
  {
    GetMatrix_22(id0);
  }

  private native void GetModelToWorldMatrix_23(vtkMatrix4x4 id0);
  public void GetModelToWorldMatrix(vtkMatrix4x4 id0)
  {
    GetModelToWorldMatrix_23(id0);
  }

  private native void SetPropertiesFromModelToWorldMatrix_24(vtkMatrix4x4 id0);
  public void SetPropertiesFromModelToWorldMatrix(vtkMatrix4x4 id0)
  {
    SetPropertiesFromModelToWorldMatrix_24(id0);
  }

  private native void GetBounds_25(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_25(id0);
  }

  private native double[] GetBounds_26();
  public double[] GetBounds()
  {
    return GetBounds_26();
  }

  private native double[] GetCenter_27();
  public double[] GetCenter()
  {
    return GetCenter_27();
  }

  private native double[] GetXRange_28();
  public double[] GetXRange()
  {
    return GetXRange_28();
  }

  private native double[] GetYRange_29();
  public double[] GetYRange()
  {
    return GetYRange_29();
  }

  private native double[] GetZRange_30();
  public double[] GetZRange()
  {
    return GetZRange_30();
  }

  private native double GetLength_31();
  public double GetLength()
  {
    return GetLength_31();
  }

  private native void RotateX_32(double id0);
  public void RotateX(double id0)
  {
    RotateX_32(id0);
  }

  private native void RotateY_33(double id0);
  public void RotateY(double id0)
  {
    RotateY_33(id0);
  }

  private native void RotateZ_34(double id0);
  public void RotateZ(double id0)
  {
    RotateZ_34(id0);
  }

  private native void RotateWXYZ_35(double id0,double id1,double id2,double id3);
  public void RotateWXYZ(double id0,double id1,double id2,double id3)
  {
    RotateWXYZ_35(id0,id1,id2,id3);
  }

  private native void SetOrientation_36(double id0,double id1,double id2);
  public void SetOrientation(double id0,double id1,double id2)
  {
    SetOrientation_36(id0,id1,id2);
  }

  private native void SetOrientation_37(double id0[]);
  public void SetOrientation(double id0[])
  {
    SetOrientation_37(id0);
  }

  private native double[] GetOrientation_38();
  public double[] GetOrientation()
  {
    return GetOrientation_38();
  }

  private native void GetOrientation_39(double id0[]);
  public void GetOrientation(double id0[])
  {
    GetOrientation_39(id0);
  }

  private native double[] GetOrientationWXYZ_40();
  public double[] GetOrientationWXYZ()
  {
    return GetOrientationWXYZ_40();
  }

  private native void AddOrientation_41(double id0,double id1,double id2);
  public void AddOrientation(double id0,double id1,double id2)
  {
    AddOrientation_41(id0,id1,id2);
  }

  private native void AddOrientation_42(double id0[]);
  public void AddOrientation(double id0[])
  {
    AddOrientation_42(id0);
  }

  private native void PokeMatrix_43(vtkMatrix4x4 id0);
  public void PokeMatrix(vtkMatrix4x4 id0)
  {
    PokeMatrix_43(id0);
  }

  private native void InitPathTraversal_44();
  public void InitPathTraversal()
  {
    InitPathTraversal_44();
  }

  private native long GetMTime_45();
  public long GetMTime()
  {
    return GetMTime_45();
  }

  private native long GetUserTransformMatrixMTime_46();
  public long GetUserTransformMatrixMTime()
  {
    return GetUserTransformMatrixMTime_46();
  }

  private native void ComputeMatrix_47();
  public void ComputeMatrix()
  {
    ComputeMatrix_47();
  }

  private native long GetMatrix_48();
  public vtkMatrix4x4 GetMatrix()
  {
    long temp = GetMatrix_48();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetIsIdentity_49();
  public int GetIsIdentity()
  {
    return GetIsIdentity_49();
  }

  private native void SetCoordinateSystemToWorld_50();
  public void SetCoordinateSystemToWorld()
  {
    SetCoordinateSystemToWorld_50();
  }

  private native void SetCoordinateSystemToPhysical_51();
  public void SetCoordinateSystemToPhysical()
  {
    SetCoordinateSystemToPhysical_51();
  }

  private native void SetCoordinateSystemToDevice_52();
  public void SetCoordinateSystemToDevice()
  {
    SetCoordinateSystemToDevice_52();
  }

  private native void SetCoordinateSystem_53(int id0);
  public void SetCoordinateSystem(int id0)
  {
    SetCoordinateSystem_53(id0);
  }

  private native int GetCoordinateSystem_54();
  public int GetCoordinateSystem()
  {
    return GetCoordinateSystem_54();
  }

  private native byte[] GetCoordinateSystemAsString_55();
  public String GetCoordinateSystemAsString()
  {
    return new String(GetCoordinateSystemAsString_55(), StandardCharsets.UTF_8);
  }

  private native void SetCoordinateSystemRenderer_56(vtkRenderer id0);
  public void SetCoordinateSystemRenderer(vtkRenderer id0)
  {
    SetCoordinateSystemRenderer_56(id0);
  }

  private native long GetCoordinateSystemRenderer_57();
  public vtkRenderer GetCoordinateSystemRenderer()
  {
    long temp = GetCoordinateSystemRenderer_57();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCoordinateSystemDevice_58(int id0);
  public void SetCoordinateSystemDevice(int id0)
  {
    SetCoordinateSystemDevice_58(id0);
  }

  private native int GetCoordinateSystemDevice_59();
  public int GetCoordinateSystemDevice()
  {
    return GetCoordinateSystemDevice_59();
  }

  public vtkProp3D() { super(); }

  public vtkProp3D(long id) { super(id); }

}
