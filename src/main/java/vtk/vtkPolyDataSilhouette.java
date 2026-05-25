// java wrapper for vtkPolyDataSilhouette object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataSilhouette extends vtkPolyDataAlgorithm
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

  private native void SetEnableFeatureAngle_4(int id0);
  public void SetEnableFeatureAngle(int id0)
  {
    SetEnableFeatureAngle_4(id0);
  }

  private native int GetEnableFeatureAngle_5();
  public int GetEnableFeatureAngle()
  {
    return GetEnableFeatureAngle_5();
  }

  private native void SetFeatureAngle_6(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_6(id0);
  }

  private native double GetFeatureAngle_7();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_7();
  }

  private native void SetBorderEdges_8(int id0);
  public void SetBorderEdges(int id0)
  {
    SetBorderEdges_8(id0);
  }

  private native int GetBorderEdges_9();
  public int GetBorderEdges()
  {
    return GetBorderEdges_9();
  }

  private native void BorderEdgesOn_10();
  public void BorderEdgesOn()
  {
    BorderEdgesOn_10();
  }

  private native void BorderEdgesOff_11();
  public void BorderEdgesOff()
  {
    BorderEdgesOff_11();
  }

  private native void SetPieceInvariant_12(int id0);
  public void SetPieceInvariant(int id0)
  {
    SetPieceInvariant_12(id0);
  }

  private native int GetPieceInvariant_13();
  public int GetPieceInvariant()
  {
    return GetPieceInvariant_13();
  }

  private native void PieceInvariantOn_14();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_14();
  }

  private native void PieceInvariantOff_15();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_15();
  }

  private native void SetDirection_16(int id0);
  public void SetDirection(int id0)
  {
    SetDirection_16(id0);
  }

  private native int GetDirection_17();
  public int GetDirection()
  {
    return GetDirection_17();
  }

  private native void SetDirectionToSpecifiedVector_18();
  public void SetDirectionToSpecifiedVector()
  {
    SetDirectionToSpecifiedVector_18();
  }

  private native void SetDirectionToSpecifiedOrigin_19();
  public void SetDirectionToSpecifiedOrigin()
  {
    SetDirectionToSpecifiedOrigin_19();
  }

  private native void SetDirectionToCameraVector_20();
  public void SetDirectionToCameraVector()
  {
    SetDirectionToCameraVector_20();
  }

  private native void SetDirectionToCameraOrigin_21();
  public void SetDirectionToCameraOrigin()
  {
    SetDirectionToCameraOrigin_21();
  }

  private native void SetCamera_22(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_22(id0);
  }

  private native long GetCamera_23();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_23();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProp3D_24(vtkProp3D id0);
  public void SetProp3D(vtkProp3D id0)
  {
    SetProp3D_24(id0);
  }

  private native long GetProp3D_25();
  public vtkProp3D GetProp3D()
  {
    long temp = GetProp3D_25();

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVector_26(double id0,double id1,double id2);
  public void SetVector(double id0,double id1,double id2)
  {
    SetVector_26(id0,id1,id2);
  }

  private native void SetVector_27(double id0[]);
  public void SetVector(double id0[])
  {
    SetVector_27(id0);
  }

  private native double[] GetVector_28();
  public double[] GetVector()
  {
    return GetVector_28();
  }

  private native void SetOrigin_29(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_29(id0,id1,id2);
  }

  private native void SetOrigin_30(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_30(id0);
  }

  private native double[] GetOrigin_31();
  public double[] GetOrigin()
  {
    return GetOrigin_31();
  }

  private native long GetMTime_32();
  public long GetMTime()
  {
    return GetMTime_32();
  }

  public vtkPolyDataSilhouette() { super(); }

  public vtkPolyDataSilhouette(long id) { super(id); }
  public native long   VTKInit();

}
