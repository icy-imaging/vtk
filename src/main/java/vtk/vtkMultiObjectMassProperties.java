// java wrapper for vtkMultiObjectMassProperties object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiObjectMassProperties extends vtkPolyDataAlgorithm
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

  private native void SetSkipValidityCheck_4(int id0);
  public void SetSkipValidityCheck(int id0)
  {
    SetSkipValidityCheck_4(id0);
  }

  private native int GetSkipValidityCheck_5();
  public int GetSkipValidityCheck()
  {
    return GetSkipValidityCheck_5();
  }

  private native void SkipValidityCheckOn_6();
  public void SkipValidityCheckOn()
  {
    SkipValidityCheckOn_6();
  }

  private native void SkipValidityCheckOff_7();
  public void SkipValidityCheckOff()
  {
    SkipValidityCheckOff_7();
  }

  private native void SetObjectIdsArrayName_8(byte[] id0, int len0);
  public void SetObjectIdsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetObjectIdsArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetObjectIdsArrayName_9();
  public String GetObjectIdsArrayName()
  {
    return new String(GetObjectIdsArrayName_9(), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfObjects_10();
  public long GetNumberOfObjects()
  {
    return GetNumberOfObjects_10();
  }

  private native int GetAllValid_11();
  public int GetAllValid()
  {
    return GetAllValid_11();
  }

  private native double GetTotalVolume_12();
  public double GetTotalVolume()
  {
    return GetTotalVolume_12();
  }

  private native double GetTotalArea_13();
  public double GetTotalArea()
  {
    return GetTotalArea_13();
  }

  public vtkMultiObjectMassProperties() { super(); }

  public vtkMultiObjectMassProperties(long id) { super(id); }
  public native long   VTKInit();

}
