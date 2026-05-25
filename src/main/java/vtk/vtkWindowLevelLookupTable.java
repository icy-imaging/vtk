// java wrapper for vtkWindowLevelLookupTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindowLevelLookupTable extends vtkLookupTable
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

  private native void ForceBuild_4();
  public void ForceBuild()
  {
    ForceBuild_4();
  }

  private native void SetWindow_5(double id0);
  public void SetWindow(double id0)
  {
    SetWindow_5(id0);
  }

  private native double GetWindow_6();
  public double GetWindow()
  {
    return GetWindow_6();
  }

  private native void SetLevel_7(double id0);
  public void SetLevel(double id0)
  {
    SetLevel_7(id0);
  }

  private native double GetLevel_8();
  public double GetLevel()
  {
    return GetLevel_8();
  }

  private native void SetInverseVideo_9(int id0);
  public void SetInverseVideo(int id0)
  {
    SetInverseVideo_9(id0);
  }

  private native int GetInverseVideo_10();
  public int GetInverseVideo()
  {
    return GetInverseVideo_10();
  }

  private native void InverseVideoOn_11();
  public void InverseVideoOn()
  {
    InverseVideoOn_11();
  }

  private native void InverseVideoOff_12();
  public void InverseVideoOff()
  {
    InverseVideoOff_12();
  }

  private native void SetMinimumTableValue_13(double id0,double id1,double id2,double id3);
  public void SetMinimumTableValue(double id0,double id1,double id2,double id3)
  {
    SetMinimumTableValue_13(id0,id1,id2,id3);
  }

  private native void SetMinimumTableValue_14(double id0[]);
  public void SetMinimumTableValue(double id0[])
  {
    SetMinimumTableValue_14(id0);
  }

  private native double[] GetMinimumTableValue_15();
  public double[] GetMinimumTableValue()
  {
    return GetMinimumTableValue_15();
  }

  private native void SetMaximumTableValue_16(double id0,double id1,double id2,double id3);
  public void SetMaximumTableValue(double id0,double id1,double id2,double id3)
  {
    SetMaximumTableValue_16(id0,id1,id2,id3);
  }

  private native void SetMaximumTableValue_17(double id0[]);
  public void SetMaximumTableValue(double id0[])
  {
    SetMaximumTableValue_17(id0);
  }

  private native double[] GetMaximumTableValue_18();
  public double[] GetMaximumTableValue()
  {
    return GetMaximumTableValue_18();
  }

  public vtkWindowLevelLookupTable() { super(); }

  public vtkWindowLevelLookupTable(long id) { super(id); }
  public native long   VTKInit();

}
