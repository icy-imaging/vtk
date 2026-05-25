// java wrapper for vtkUnstructuredGridPreIntegration object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridPreIntegration extends vtkUnstructuredGridVolumeRayIntegrator
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

  private native void Initialize_4(vtkVolume id0,vtkDataArray id1);
  public void Initialize(vtkVolume id0,vtkDataArray id1)
  {
    Initialize_4(id0,id1);
  }

  private native void Integrate_5(vtkDoubleArray id0,vtkDataArray id1,vtkDataArray id2,float id3[]);
  public void Integrate(vtkDoubleArray id0,vtkDataArray id1,vtkDataArray id2,float id3[])
  {
    Integrate_5(id0,id1,id2,id3);
  }

  private native long GetIntegrator_6();
  public vtkUnstructuredGridVolumeRayIntegrator GetIntegrator()
  {
    long temp = GetIntegrator_6();

    if (temp == 0) return null;
    return (vtkUnstructuredGridVolumeRayIntegrator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegrator_7(vtkUnstructuredGridVolumeRayIntegrator id0);
  public void SetIntegrator(vtkUnstructuredGridVolumeRayIntegrator id0)
  {
    SetIntegrator_7(id0);
  }

  private native void SetIntegrationTableScalarResolution_8(int id0);
  public void SetIntegrationTableScalarResolution(int id0)
  {
    SetIntegrationTableScalarResolution_8(id0);
  }

  private native int GetIntegrationTableScalarResolution_9();
  public int GetIntegrationTableScalarResolution()
  {
    return GetIntegrationTableScalarResolution_9();
  }

  private native void SetIntegrationTableLengthResolution_10(int id0);
  public void SetIntegrationTableLengthResolution(int id0)
  {
    SetIntegrationTableLengthResolution_10(id0);
  }

  private native int GetIntegrationTableLengthResolution_11();
  public int GetIntegrationTableLengthResolution()
  {
    return GetIntegrationTableLengthResolution_11();
  }

  private native double GetIntegrationTableScalarShift_12(int id0);
  public double GetIntegrationTableScalarShift(int id0)
  {
    return GetIntegrationTableScalarShift_12(id0);
  }

  private native double GetIntegrationTableScalarScale_13(int id0);
  public double GetIntegrationTableScalarScale(int id0)
  {
    return GetIntegrationTableScalarScale_13(id0);
  }

  private native double GetIntegrationTableLengthScale_14();
  public double GetIntegrationTableLengthScale()
  {
    return GetIntegrationTableLengthScale_14();
  }

  private native int GetIncrementalPreIntegration_15();
  public int GetIncrementalPreIntegration()
  {
    return GetIncrementalPreIntegration_15();
  }

  private native void SetIncrementalPreIntegration_16(int id0);
  public void SetIncrementalPreIntegration(int id0)
  {
    SetIncrementalPreIntegration_16(id0);
  }

  private native void IncrementalPreIntegrationOn_17();
  public void IncrementalPreIntegrationOn()
  {
    IncrementalPreIntegrationOn_17();
  }

  private native void IncrementalPreIntegrationOff_18();
  public void IncrementalPreIntegrationOff()
  {
    IncrementalPreIntegrationOff_18();
  }

  public vtkUnstructuredGridPreIntegration() { super(); }

  public vtkUnstructuredGridPreIntegration(long id) { super(id); }
  public native long   VTKInit();

}
