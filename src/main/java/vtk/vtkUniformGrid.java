// java wrapper for vtkUniformGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniformGrid extends vtkImageData
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

  private native void CopyStructure_4(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_4(id0);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native int GetGridDescription_7();
  public int GetGridDescription()
  {
    return GetGridDescription_7();
  }

  private native long NewImageDataCopy_8();
  public vtkImageData NewImageDataCopy()
  {
    long temp = NewImageDataCopy_8();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_9(vtkInformation id0);
  public vtkUniformGrid GetData(vtkInformation id0)
  {
    long temp = GetData_9(id0);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_10(vtkInformationVector id0,int id1);
  public vtkUniformGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_10(id0,id1);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUniformGrid() { super(); }

  public vtkUniformGrid(long id) { super(id); }
  public native long   VTKInit();

}
