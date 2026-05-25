// java wrapper for vtkExtentSplitter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtentSplitter extends vtkObject
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

  private native void AddExtentSource_4(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7);
  public void AddExtentSource(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7)
  {
    AddExtentSource_4(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void RemoveExtentSource_5(int id0);
  public void RemoveExtentSource(int id0)
  {
    RemoveExtentSource_5(id0);
  }

  private native void RemoveAllExtentSources_6();
  public void RemoveAllExtentSources()
  {
    RemoveAllExtentSources_6();
  }

  private native void AddExtent_7(int id0,int id1,int id2,int id3,int id4,int id5);
  public void AddExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    AddExtent_7(id0,id1,id2,id3,id4,id5);
  }

  private native int ComputeSubExtents_8();
  public int ComputeSubExtents()
  {
    return ComputeSubExtents_8();
  }

  private native int GetNumberOfSubExtents_9();
  public int GetNumberOfSubExtents()
  {
    return GetNumberOfSubExtents_9();
  }

  private native int[] GetSubExtent_10(int id0);
  public int[] GetSubExtent(int id0)
  {
    return GetSubExtent_10(id0);
  }

  private native int GetSubExtentSource_11(int id0);
  public int GetSubExtentSource(int id0)
  {
    return GetSubExtentSource_11(id0);
  }

  private native int GetPointMode_12();
  public int GetPointMode()
  {
    return GetPointMode_12();
  }

  private native void SetPointMode_13(int id0);
  public void SetPointMode(int id0)
  {
    SetPointMode_13(id0);
  }

  private native void PointModeOn_14();
  public void PointModeOn()
  {
    PointModeOn_14();
  }

  private native void PointModeOff_15();
  public void PointModeOff()
  {
    PointModeOff_15();
  }

  public vtkExtentSplitter() { super(); }

  public vtkExtentSplitter(long id) { super(id); }
  public native long   VTKInit();

}
