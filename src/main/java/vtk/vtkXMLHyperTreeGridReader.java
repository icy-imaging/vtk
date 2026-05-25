// java wrapper for vtkXMLHyperTreeGridReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLHyperTreeGridReader extends vtkXMLReader
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
  public vtkHyperTreeGrid GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkHyperTreeGrid GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFixedLevel_6(int id0);
  public void SetFixedLevel(int id0)
  {
    SetFixedLevel_6(id0);
  }

  private native int GetFixedLevel_7();
  public int GetFixedLevel()
  {
    return GetFixedLevel_7();
  }

  private native void SetCoordinatesBoundingBox_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCoordinatesBoundingBox(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCoordinatesBoundingBox_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetIndicesBoundingBox_9(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetIndicesBoundingBox(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetIndicesBoundingBox_9(id0,id1,id2,id3,id4,id5);
  }

  private native void ClearAndAddSelectedHT_10(int id0,int id1);
  public void ClearAndAddSelectedHT(int id0,int id1)
  {
    ClearAndAddSelectedHT_10(id0,id1);
  }

  private native void AddSelectedHT_11(int id0,int id1);
  public void AddSelectedHT(int id0,int id1)
  {
    AddSelectedHT_11(id0,id1);
  }

  private native long GetNumberOfPoints_12();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_12();
  }

  private native long GetNumberOfPieces_13();
  public long GetNumberOfPieces()
  {
    return GetNumberOfPieces_13();
  }

  private native void SetupUpdateExtent_14(int id0,int id1);
  public void SetupUpdateExtent(int id0,int id1)
  {
    SetupUpdateExtent_14(id0,id1);
  }

  private native void CopyOutputInformation_15(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_15(id0,id1);
  }

  private native void ReadXMLData_16();
  public void ReadXMLData()
  {
    ReadXMLData_16();
  }

  public vtkXMLHyperTreeGridReader() { super(); }

  public vtkXMLHyperTreeGridReader(long id) { super(id); }
  public native long   VTKInit();

}
