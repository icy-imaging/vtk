// java wrapper for vtkDeformPointSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDeformPointSet extends vtkPointSetAlgorithm
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

  private native void SetControlMeshData_4(vtkPolyData id0);
  public void SetControlMeshData(vtkPolyData id0)
  {
    SetControlMeshData_4(id0);
  }

  private native long GetControlMeshData_5();
  public vtkPolyData GetControlMeshData()
  {
    long temp = GetControlMeshData_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetControlMeshConnection_6(vtkAlgorithmOutput id0);
  public void SetControlMeshConnection(vtkAlgorithmOutput id0)
  {
    SetControlMeshConnection_6(id0);
  }

  private native void SetInitializeWeights_7(int id0);
  public void SetInitializeWeights(int id0)
  {
    SetInitializeWeights_7(id0);
  }

  private native int GetInitializeWeights_8();
  public int GetInitializeWeights()
  {
    return GetInitializeWeights_8();
  }

  private native void InitializeWeightsOn_9();
  public void InitializeWeightsOn()
  {
    InitializeWeightsOn_9();
  }

  private native void InitializeWeightsOff_10();
  public void InitializeWeightsOff()
  {
    InitializeWeightsOff_10();
  }

  public vtkDeformPointSet() { super(); }

  public vtkDeformPointSet(long id) { super(id); }
  public native long   VTKInit();

}
