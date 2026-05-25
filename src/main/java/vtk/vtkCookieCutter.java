// java wrapper for vtkCookieCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCookieCutter extends vtkPolyDataAlgorithm
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

  private native void SetLoopsConnection_4(vtkAlgorithmOutput id0);
  public void SetLoopsConnection(vtkAlgorithmOutput id0)
  {
    SetLoopsConnection_4(id0);
  }

  private native long GetLoopsConnection_5();
  public vtkAlgorithmOutput GetLoopsConnection()
  {
    long temp = GetLoopsConnection_5();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLoopsData_6(vtkDataObject id0);
  public void SetLoopsData(vtkDataObject id0)
  {
    SetLoopsData_6(id0);
  }

  private native long GetLoops_7();
  public vtkDataObject GetLoops()
  {
    long temp = GetLoops_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPassCellData_8(boolean id0);
  public void SetPassCellData(boolean id0)
  {
    SetPassCellData_8(id0);
  }

  private native boolean GetPassCellData_9();
  public boolean GetPassCellData()
  {
    return GetPassCellData_9();
  }

  private native void PassCellDataOn_10();
  public void PassCellDataOn()
  {
    PassCellDataOn_10();
  }

  private native void PassCellDataOff_11();
  public void PassCellDataOff()
  {
    PassCellDataOff_11();
  }

  private native void SetPassPointData_12(boolean id0);
  public void SetPassPointData(boolean id0)
  {
    SetPassPointData_12(id0);
  }

  private native boolean GetPassPointData_13();
  public boolean GetPassPointData()
  {
    return GetPassPointData_13();
  }

  private native void PassPointDataOn_14();
  public void PassPointDataOn()
  {
    PassPointDataOn_14();
  }

  private native void PassPointDataOff_15();
  public void PassPointDataOff()
  {
    PassPointDataOff_15();
  }

  private native void SetPointInterpolation_16(int id0);
  public void SetPointInterpolation(int id0)
  {
    SetPointInterpolation_16(id0);
  }

  private native int GetPointInterpolationMinValue_17();
  public int GetPointInterpolationMinValue()
  {
    return GetPointInterpolationMinValue_17();
  }

  private native int GetPointInterpolationMaxValue_18();
  public int GetPointInterpolationMaxValue()
  {
    return GetPointInterpolationMaxValue_18();
  }

  private native int GetPointInterpolation_19();
  public int GetPointInterpolation()
  {
    return GetPointInterpolation_19();
  }

  private native void SetPointInterpolationToMeshEdges_20();
  public void SetPointInterpolationToMeshEdges()
  {
    SetPointInterpolationToMeshEdges_20();
  }

  private native void SetPointInterpolationToLoopEdges_21();
  public void SetPointInterpolationToLoopEdges()
  {
    SetPointInterpolationToLoopEdges_21();
  }

  private native void SetLocator_22(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_22(id0);
  }

  private native long GetLocator_23();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_23();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_24();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_24();
  }

  public vtkCookieCutter() { super(); }

  public vtkCookieCutter(long id) { super(id); }
  public native long   VTKInit();

}
