// java wrapper for vtkAMRBaseReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRBaseReader extends vtkOverlappingAMRAlgorithm
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void SetEnableCaching_5(int id0);
  public void SetEnableCaching(int id0)
  {
    SetEnableCaching_5(id0);
  }

  private native int GetEnableCaching_6();
  public int GetEnableCaching()
  {
    return GetEnableCaching_6();
  }

  private native void EnableCachingOn_7();
  public void EnableCachingOn()
  {
    EnableCachingOn_7();
  }

  private native void EnableCachingOff_8();
  public void EnableCachingOff()
  {
    EnableCachingOff_8();
  }

  private native boolean IsCachingEnabled_9();
  public boolean IsCachingEnabled()
  {
    return IsCachingEnabled_9();
  }

  private native void SetController_10(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_10(id0);
  }

  private native long GetController_11();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_11();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaxLevel_12(int id0);
  public void SetMaxLevel(int id0)
  {
    SetMaxLevel_12(id0);
  }

  private native long GetCellDataArraySelection_13();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_13();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_14();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_14();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_15();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_15();
  }

  private native int GetNumberOfCellArrays_16();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_16();
  }

  private native byte[] GetPointArrayName_17(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_17(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_18(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_18(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_19(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_19(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_20(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_20(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_21(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_21(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_22(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_22(bytes0, bytes0.length,id1);
  }

  private native byte[] GetFileName_23();
  public String GetFileName()
  {
    return new String(GetFileName_23(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_24(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_24(bytes0, bytes0.length);
  }

  private native int GetNumberOfBlocks_25();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_25();
  }

  private native int GetNumberOfLevels_26();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_26();
  }

  public vtkAMRBaseReader() { super(); }

  public vtkAMRBaseReader(long id) { super(id); }

}
