// java wrapper for vtkReaderAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkReaderAlgorithm extends vtkAlgorithm
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

  private native long CreateOutput_4(vtkDataObject id0);
  public vtkDataObject CreateOutput(vtkDataObject id0)
  {
    long temp = CreateOutput_4(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int ReadMetaData_5(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_5(id0);
  }

  private native int ReadTimeDependentMetaData_6(int id0,vtkInformation id1);
  public int ReadTimeDependentMetaData(int id0,vtkInformation id1)
  {
    return ReadTimeDependentMetaData_6(id0,id1);
  }

  private native int ReadMesh_7(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_7(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_8(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_8(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_9(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_9(id0,id1,id2,id3,id4);
  }

  public vtkReaderAlgorithm() { super(); }

  public vtkReaderAlgorithm(long id) { super(id); }

}
