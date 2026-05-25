// java wrapper for vtkKdTreeSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKdTreeSelector extends vtkSelectionAlgorithm
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

  private native void SetKdTree_4(vtkKdTree id0);
  public void SetKdTree(vtkKdTree id0)
  {
    SetKdTree_4(id0);
  }

  private native long GetKdTree_5();
  public vtkKdTree GetKdTree()
  {
    long temp = GetKdTree_5();

    if (temp == 0) return null;
    return (vtkKdTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionBounds_6(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetSelectionBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetSelectionBounds_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetSelectionBounds_7(double id0[]);
  public void SetSelectionBounds(double id0[])
  {
    SetSelectionBounds_7(id0);
  }

  private native double[] GetSelectionBounds_8();
  public double[] GetSelectionBounds()
  {
    return GetSelectionBounds_8();
  }

  private native void SetSelectionFieldName_9(byte[] id0, int len0);
  public void SetSelectionFieldName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelectionFieldName_9(bytes0, bytes0.length);
  }

  private native byte[] GetSelectionFieldName_10();
  public String GetSelectionFieldName()
  {
    return new String(GetSelectionFieldName_10(), StandardCharsets.UTF_8);
  }

  private native void SetSelectionAttribute_11(int id0);
  public void SetSelectionAttribute(int id0)
  {
    SetSelectionAttribute_11(id0);
  }

  private native int GetSelectionAttribute_12();
  public int GetSelectionAttribute()
  {
    return GetSelectionAttribute_12();
  }

  private native void SetSingleSelection_13(boolean id0);
  public void SetSingleSelection(boolean id0)
  {
    SetSingleSelection_13(id0);
  }

  private native boolean GetSingleSelection_14();
  public boolean GetSingleSelection()
  {
    return GetSingleSelection_14();
  }

  private native void SingleSelectionOn_15();
  public void SingleSelectionOn()
  {
    SingleSelectionOn_15();
  }

  private native void SingleSelectionOff_16();
  public void SingleSelectionOff()
  {
    SingleSelectionOff_16();
  }

  private native void SetSingleSelectionThreshold_17(double id0);
  public void SetSingleSelectionThreshold(double id0)
  {
    SetSingleSelectionThreshold_17(id0);
  }

  private native double GetSingleSelectionThreshold_18();
  public double GetSingleSelectionThreshold()
  {
    return GetSingleSelectionThreshold_18();
  }

  private native long GetMTime_19();
  public long GetMTime()
  {
    return GetMTime_19();
  }

  public vtkKdTreeSelector() { super(); }

  public vtkKdTreeSelector(long id) { super(id); }
  public native long   VTKInit();

}
