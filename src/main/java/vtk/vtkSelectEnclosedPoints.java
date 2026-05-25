// java wrapper for vtkSelectEnclosedPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelectEnclosedPoints extends vtkDataSetAlgorithm
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

  private native void SetSurfaceData_4(vtkPolyData id0);
  public void SetSurfaceData(vtkPolyData id0)
  {
    SetSurfaceData_4(id0);
  }

  private native void SetSurfaceConnection_5(vtkAlgorithmOutput id0);
  public void SetSurfaceConnection(vtkAlgorithmOutput id0)
  {
    SetSurfaceConnection_5(id0);
  }

  private native long GetSurface_6();
  public vtkPolyData GetSurface()
  {
    long temp = GetSurface_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSurface_7(vtkInformationVector id0);
  public vtkPolyData GetSurface(vtkInformationVector id0)
  {
    long temp = GetSurface_7(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInsideOut_8(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_8(id0);
  }

  private native void InsideOutOn_9();
  public void InsideOutOn()
  {
    InsideOutOn_9();
  }

  private native void InsideOutOff_10();
  public void InsideOutOff()
  {
    InsideOutOff_10();
  }

  private native int GetInsideOut_11();
  public int GetInsideOut()
  {
    return GetInsideOut_11();
  }

  private native void SetCheckSurface_12(int id0);
  public void SetCheckSurface(int id0)
  {
    SetCheckSurface_12(id0);
  }

  private native void CheckSurfaceOn_13();
  public void CheckSurfaceOn()
  {
    CheckSurfaceOn_13();
  }

  private native void CheckSurfaceOff_14();
  public void CheckSurfaceOff()
  {
    CheckSurfaceOff_14();
  }

  private native int GetCheckSurface_15();
  public int GetCheckSurface()
  {
    return GetCheckSurface_15();
  }

  private native int IsInside_16(long id0);
  public int IsInside(long id0)
  {
    return IsInside_16(id0);
  }

  private native void SetTolerance_17(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_17(id0);
  }

  private native double GetToleranceMinValue_18();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_18();
  }

  private native double GetToleranceMaxValue_19();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_19();
  }

  private native double GetTolerance_20();
  public double GetTolerance()
  {
    return GetTolerance_20();
  }

  private native void Initialize_21(vtkPolyData id0);
  public void Initialize(vtkPolyData id0)
  {
    Initialize_21(id0);
  }

  private native int IsInsideSurface_22(double id0[]);
  public int IsInsideSurface(double id0[])
  {
    return IsInsideSurface_22(id0);
  }

  private native int IsInsideSurface_23(double id0,double id1,double id2);
  public int IsInsideSurface(double id0,double id1,double id2)
  {
    return IsInsideSurface_23(id0,id1,id2);
  }

  private native void Complete_24();
  public void Complete()
  {
    Complete_24();
  }

  private native int IsSurfaceClosed_25(vtkPolyData id0);
  public int IsSurfaceClosed(vtkPolyData id0)
  {
    return IsSurfaceClosed_25(id0);
  }

  public vtkSelectEnclosedPoints() { super(); }

  public vtkSelectEnclosedPoints(long id) { super(id); }
  public native long   VTKInit();

}
