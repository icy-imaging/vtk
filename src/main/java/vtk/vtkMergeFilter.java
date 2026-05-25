// java wrapper for vtkMergeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeFilter extends vtkDataSetAlgorithm
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

  private native void SetGeometryInputData_4(vtkDataSet id0);
  public void SetGeometryInputData(vtkDataSet id0)
  {
    SetGeometryInputData_4(id0);
  }

  private native long GetGeometry_5();
  public vtkDataSet GetGeometry()
  {
    long temp = GetGeometry_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometryConnection_6(vtkAlgorithmOutput id0);
  public void SetGeometryConnection(vtkAlgorithmOutput id0)
  {
    SetGeometryConnection_6(id0);
  }

  private native void SetScalarsData_7(vtkDataSet id0);
  public void SetScalarsData(vtkDataSet id0)
  {
    SetScalarsData_7(id0);
  }

  private native long GetScalars_8();
  public vtkDataSet GetScalars()
  {
    long temp = GetScalars_8();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarsConnection_9(vtkAlgorithmOutput id0);
  public void SetScalarsConnection(vtkAlgorithmOutput id0)
  {
    SetScalarsConnection_9(id0);
  }

  private native void SetVectorsData_10(vtkDataSet id0);
  public void SetVectorsData(vtkDataSet id0)
  {
    SetVectorsData_10(id0);
  }

  private native long GetVectors_11();
  public vtkDataSet GetVectors()
  {
    long temp = GetVectors_11();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVectorsConnection_12(vtkAlgorithmOutput id0);
  public void SetVectorsConnection(vtkAlgorithmOutput id0)
  {
    SetVectorsConnection_12(id0);
  }

  private native void SetNormalsData_13(vtkDataSet id0);
  public void SetNormalsData(vtkDataSet id0)
  {
    SetNormalsData_13(id0);
  }

  private native long GetNormals_14();
  public vtkDataSet GetNormals()
  {
    long temp = GetNormals_14();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNormalsConnection_15(vtkAlgorithmOutput id0);
  public void SetNormalsConnection(vtkAlgorithmOutput id0)
  {
    SetNormalsConnection_15(id0);
  }

  private native void SetTCoordsData_16(vtkDataSet id0);
  public void SetTCoordsData(vtkDataSet id0)
  {
    SetTCoordsData_16(id0);
  }

  private native long GetTCoords_17();
  public vtkDataSet GetTCoords()
  {
    long temp = GetTCoords_17();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTCoordsConnection_18(vtkAlgorithmOutput id0);
  public void SetTCoordsConnection(vtkAlgorithmOutput id0)
  {
    SetTCoordsConnection_18(id0);
  }

  private native void SetTensorsData_19(vtkDataSet id0);
  public void SetTensorsData(vtkDataSet id0)
  {
    SetTensorsData_19(id0);
  }

  private native long GetTensors_20();
  public vtkDataSet GetTensors()
  {
    long temp = GetTensors_20();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTensorsConnection_21(vtkAlgorithmOutput id0);
  public void SetTensorsConnection(vtkAlgorithmOutput id0)
  {
    SetTensorsConnection_21(id0);
  }

  private native void AddField_22(byte[] id0, int len0,vtkDataSet id1);
  public void AddField(String id0,vtkDataSet id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddField_22(bytes0, bytes0.length,id1);
  }

  public vtkMergeFilter() { super(); }

  public vtkMergeFilter(long id) { super(id); }
  public native long   VTKInit();

}
