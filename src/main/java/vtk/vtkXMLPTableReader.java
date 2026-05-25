// java wrapper for vtkXMLPTableReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLPTableReader extends vtkXMLPDataObjectReader
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

  private native long GetOutput_4();
  public vtkTable GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkTable GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyOutputInformation_6(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_6(id0,id1);
  }

  private native int GetNumberOfColumnArrays_7();
  public int GetNumberOfColumnArrays()
  {
    return GetNumberOfColumnArrays_7();
  }

  private native byte[] GetColumnArrayName_8(int id0);
  public String GetColumnArrayName(int id0)
  {
    return new String(GetColumnArrayName_8(id0), StandardCharsets.UTF_8);
  }

  private native int GetColumnArrayStatus_9(byte[] id0, int len0);
  public int GetColumnArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnArrayStatus_9(bytes0, bytes0.length);
  }

  private native void SetColumnArrayStatus_10(byte[] id0, int len0,int id1);
  public void SetColumnArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnArrayStatus_10(bytes0, bytes0.length,id1);
  }

  private native long GetColumnSelection_11();
  public vtkDataArraySelection GetColumnSelection()
  {
    long temp = GetColumnSelection_11();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkXMLPTableReader() { super(); }

  public vtkXMLPTableReader(long id) { super(id); }
  public native long   VTKInit();

}
